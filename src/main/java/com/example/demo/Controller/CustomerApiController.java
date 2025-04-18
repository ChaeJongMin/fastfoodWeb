package com.example.demo.Controller;

import com.example.demo.Service.CustomerService;
import com.example.demo.config.auth.jwt.JwtToken;
import com.example.demo.config.auth.jwt.domain.dto.HttpResponseDto;
import com.example.demo.dto.CustomerRequestDto;
import com.example.demo.dto.CustomerSaveRequestDto;
import com.example.demo.dto.TokenDto;
import com.example.demo.exception.UserAuthException;
import com.example.demo.exception.message.ExceptionMessage;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.security.Principal;
import java.util.Map;

@Slf4j
@RequiredArgsConstructor
@RestController
public class CustomerApiController {
    private final CustomerService customerService;
    @GetMapping("/api/customer")
    public ResponseEntity<?> info(Principal principal) {
        if (principal == null || principal.getName() == null) {
            throw new UserAuthException(ExceptionMessage.NOT_AUTHORIZED_ACCESS);
        }
        return ResponseEntity.status(HttpStatus.OK).body(customerService.findByUserId(principal.getName()));
    }
    @PostMapping("/api/customer/login")
    public ResponseEntity<?> loginSuccess(@RequestBody Map<String, String> loginForm,
                                          @CookieValue(name="refreshToken", required = false) String refreshToken) throws JsonProcessingException {
        if(refreshToken==null)
            refreshToken="not exist";
        System.out.println(refreshToken);
        ObjectMapper mapper = new ObjectMapper();
        String jsonString = mapper.writeValueAsString(customerService.login(loginForm.get("userId"), loginForm.get("userPasswd"),refreshToken));
        System.out.println("(apiLogin)변환된 jsonString: "+jsonString);
        return ResponseEntity.status(HttpStatus.OK).body(jsonString);
    }
    @PostMapping("/api/customer")
    public int sava(@RequestBody CustomerSaveRequestDto customerSaveRequestDto){
        return customerService.save(customerSaveRequestDto);
    }
    @PutMapping("/api/customer/{id}")
    public int update(@PathVariable int id, @RequestBody CustomerSaveRequestDto customerSaveRequestDto){
        return customerService.update(id,customerSaveRequestDto);
    }
    @DeleteMapping("/api/customer/logout")
    public void logout(@RequestHeader("Authorization") String accessToken){
        log.info("/api/customer/logout 작동");
        customerService.logout(accessToken);
    }

}
