package br.com.alura.screnmatch.servicos;

public interface IConverteDados {
    <T> T obterDados(String json, Class<T> classe);
    // usa-se T no generics quando não sabemos o que um método irá retornar
    // usa-se <T> no generics quando não sabemos o tipo do método
    // Aqui esse método vai receber um json e uma classe como parâmetro


}
