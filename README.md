# Aplicação WEB para o exemplo da lista de compras discutida em sala de aula

## Para executar
```mvn spring-boot:run```

## Se quiser usar Docker
### Para gerar a imagem Docker
```mvn package docker:build```

### Para executar o container
``` docker run -p 8080:8080 -it --rm exemplo-eiiv/springboot-example```

### Executar um shell no container que já está rodando
```docker exec -it ID_DO_CONTAINER /bin/ash```

## Login na interface
Login: fpu
Password: 123

