package rs.ac.uns.ftn.xml.tim11.commissionerservice.security;


import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.model.account.Account;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.repository.xml.AccountXmlRepository;
import rs.ac.uns.ftn.xml.tim11.commissionerservice.service.exceptions.AccountNotFoundException;

import java.util.Optional;

@RequiredArgsConstructor
@Service
public class CustomUserDetailsService implements UserDetailsService {
    private final AccountXmlRepository accountRepository;

    @SneakyThrows
    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
       Optional<Account> account = accountRepository.findByEmail(email);
       if(!account.isPresent())
           throw new AccountNotFoundException(email);
       return new CustomUserDetails(account.get());
    }
}
