### Spring Initializr [Link](https://start.spring.io/)
- maven
- java
- spring boot
- Spring Web
- OAuth2 Resource Server
- Spring Configuration Processor
___
gen keypair
```openssl genrsa -out keypair.pem 2048```
\
\
create public key
```openssl rsa -in keypair.pem -pubout -out public.pem```
\
\
create private key
```openssl pkcs8 -topk8 -inform PEM -outform PEM -nocrypt -in keypair.pem -out private.pem```
\
\
now we can delete keypar.pem
___
