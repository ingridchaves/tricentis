#Author: ingrid.r.cchaves@gmail.com
 @forms    
Feature: Como um cliente, eu quero enviar meu formulário de solicitação de orçamento

  @ValidCase
  Scenario: Solicitando seguro de carro
    Given que eu esteja no forumulário de Enter Vehicle Data 
    When eu clico em next enviando o formulário da aba Enter Vehicle Data preenchido
    And eu clico em next enviando o formulário da aba Enter Insurant Data preenchido
    And eu clico em next enviando o formulário da aba Enter Product Data preenchido
    And eu clico em next enviando o formulário da aba Select Price Option preenchido
    And eu clico em next enviando o formulário da aba Send Quote preenchido
    Then a mensagem Sending e-mail success! é exibida na tela