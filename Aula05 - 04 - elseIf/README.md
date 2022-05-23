# Aprendendo sobre else if

## Incluindo novas perguntas no else de cada if

> Não há limites em relação a aumentos de codições em ifs, porém deve ter cuidado com a quantidade
> Pois fica a perguntas (não seria melhor um switch ?)
>
> Porém quando utilizandos else if() 
> Se faz necessário fechar essa cadeia com um else final, por questões de boas práticas


````java
if(condicao1){
  // se atender a condição 1
}else if(condicao2){ // so entra aqui se atender a condição
 // se atender a condição 2
}else if(condicaoN){ // so entra aqui se atender a condição
 // se atender a condição N
}else{ // seria a condição que sobrou
 //pode ter alguma ação, mas mesmo que não tenha escreva mesmo assim
}
````