$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Features/Checkout.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#language: pt"
    }
  ],
  "line": 3,
  "name": "Checkout",
  "description": "",
  "id": "checkout",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "line": 2,
      "name": "@Checkout"
    },
    {
      "line": 2,
      "name": "@End2End"
    }
  ]
});
formatter.scenarioOutline({
  "line": 9,
  "name": "Clicar no botao checkout confirmar e finalizar",
  "description": "",
  "id": "checkout;clicar-no-botao-checkout-confirmar-e-finalizar",
  "type": "scenario_outline",
  "keyword": "Esquema do Cenario",
  "tags": [
    {
      "line": 8,
      "name": "@RealizarCheckout"
    },
    {
      "line": 8,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "clicar remover primeiro produto",
  "keyword": "Quando "
});
formatter.step({
  "line": 11,
  "name": "clicar no botao checkout",
  "keyword": "Entao "
});
formatter.step({
  "line": 12,
  "name": "o sistema devera preencher o nome \"\u003cnome\u003e\"",
  "keyword": "Entao "
});
formatter.step({
  "line": 13,
  "name": "o sistema devera preencher o sobrenome \"\u003csobrenome\u003e\"",
  "keyword": "E "
});
formatter.step({
  "line": 14,
  "name": "o sistema devera preencher o cep \"\u003ccep\u003e\"",
  "keyword": "E "
});
formatter.step({
  "line": 15,
  "name": "confirmar a compra",
  "keyword": "Entao "
});
formatter.step({
  "line": 16,
  "name": "finalizar",
  "keyword": "E "
});
formatter.step({
  "line": 17,
  "name": "volta para o inicio",
  "keyword": "Entao "
});
formatter.step({
  "line": 18,
  "name": "abre o menu",
  "keyword": "E "
});
formatter.step({
  "line": 19,
  "name": "faz logout",
  "keyword": "E "
});
formatter.examples({
  "line": 20,
  "name": "",
  "description": "",
  "id": "checkout;clicar-no-botao-checkout-confirmar-e-finalizar;",
  "rows": [
    {
      "cells": [
        "nome",
        "sobrenome",
        "cep"
      ],
      "line": 21,
      "id": "checkout;clicar-no-botao-checkout-confirmar-e-finalizar;;1"
    },
    {
      "cells": [
        "Tajylla",
        "Yonara",
        "72000000"
      ],
      "line": 22,
      "id": "checkout;clicar-no-botao-checkout-confirmar-e-finalizar;;2"
    }
  ],
  "keyword": "Exemplos"
});
formatter.before({
  "duration": 3365603600,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Contexto"
});
formatter.step({
  "line": 6,
  "name": "que o usuario adicionou produtos",
  "keyword": "Dado "
});
formatter.match({
  "location": "ProdutosSteps.que_o_usuario_adicionou_produtos()"
});
formatter.result({
  "duration": 8184079100,
  "status": "passed"
});
formatter.scenario({
  "line": 22,
  "name": "Clicar no botao checkout confirmar e finalizar",
  "description": "",
  "id": "checkout;clicar-no-botao-checkout-confirmar-e-finalizar;;2",
  "type": "scenario",
  "keyword": "Esquema do Cenario",
  "tags": [
    {
      "line": 2,
      "name": "@End2End"
    },
    {
      "line": 2,
      "name": "@Checkout"
    },
    {
      "line": 8,
      "name": "@RealizarCheckout"
    },
    {
      "line": 8,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "clicar remover primeiro produto",
  "keyword": "Quando "
});
formatter.step({
  "line": 11,
  "name": "clicar no botao checkout",
  "keyword": "Entao "
});
formatter.step({
  "line": 12,
  "name": "o sistema devera preencher o nome \"Tajylla\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Entao "
});
formatter.step({
  "line": 13,
  "name": "o sistema devera preencher o sobrenome \"Yonara\"",
  "matchedColumns": [
    1
  ],
  "keyword": "E "
});
formatter.step({
  "line": 14,
  "name": "o sistema devera preencher o cep \"72000000\"",
  "matchedColumns": [
    2
  ],
  "keyword": "E "
});
formatter.step({
  "line": 15,
  "name": "confirmar a compra",
  "keyword": "Entao "
});
formatter.step({
  "line": 16,
  "name": "finalizar",
  "keyword": "E "
});
formatter.step({
  "line": 17,
  "name": "volta para o inicio",
  "keyword": "Entao "
});
formatter.step({
  "line": 18,
  "name": "abre o menu",
  "keyword": "E "
});
formatter.step({
  "line": 19,
  "name": "faz logout",
  "keyword": "E "
});
formatter.match({
  "location": "CheckoutSteps.clicar_remover_primeiro_produto()"
});
formatter.result({
  "duration": 1113449300,
  "status": "passed"
});
formatter.match({
  "location": "CheckoutSteps.clicar_no_botao_checkout()"
});
formatter.result({
  "duration": 1068402400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Tajylla",
      "offset": 35
    }
  ],
  "location": "CheckoutSteps.o_sistema_devera_preencher_o_nome(String)"
});
formatter.result({
  "duration": 1089413700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Yonara",
      "offset": 40
    }
  ],
  "location": "CheckoutSteps.o_sistema_devera_preencher_o_sobrenome(String)"
});
formatter.result({
  "duration": 1088907400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "72000000",
      "offset": 34
    }
  ],
  "location": "CheckoutSteps.o_sistema_devera_preencher_o_cep(String)"
});
formatter.result({
  "duration": 1146827900,
  "status": "passed"
});
formatter.match({
  "location": "CheckoutSteps.confirmar_a_compra()"
});
formatter.result({
  "duration": 2130916900,
  "status": "passed"
});
formatter.match({
  "location": "CheckoutSteps.finalizar()"
});
formatter.result({
  "duration": 1568530600,
  "status": "passed"
});
formatter.match({
  "location": "CheckoutSteps.volta_para_o_inicio()"
});
formatter.result({
  "duration": 1076313100,
  "status": "passed"
});
formatter.match({
  "location": "CheckoutSteps.abre_o_menu()"
});
formatter.result({
  "duration": 2070866700,
  "status": "passed"
});
formatter.match({
  "location": "CheckoutSteps.faz_logout()"
});
formatter.result({
  "duration": 2060244000,
  "status": "passed"
});
formatter.after({
  "duration": 619313100,
  "status": "passed"
});
});