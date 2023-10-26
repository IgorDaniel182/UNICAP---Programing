// Saldo inicial da conta
let saldo = 1000;

// Array para armazenar o histórico de transações
const historicoTransacoes = [];

// Função para exibir o menu
function exibirMenu() {
  console.log("Bem-vindo ao Sistema de Conta Bancária! Escolha uma opção:");
  console.log("1. Depositar");
  console.log("2. Sacar");
  console.log("3. Ver Saldo");
  console.log("4. Ver Histórico de Transações");
  console.log("5. Sair");
}

// Função para realizar um depósito
function depositar() {
  const valor = parseFloat(prompt("Digite o valor a ser depositado:"));
  if (isNaN(valor) || valor <= 0) {
    console.log("Valor inválido. Tente novamente.");
  } else {
    saldo += valor;
    historicoTransacoes.push({ tipo: "Depósito", valor, data: new Date().toLocaleString() });
    console.log(`Depósito de $${valor} realizado com sucesso.`);
  }
}

// Função para realizar um saque
function sacar() {
  const valor = parseFloat(prompt("Digite o valor a ser sacado:"));
  if (isNaN(valor) || valor <= 0 || valor > saldo) {
    console.log("Valor inválido ou saldo insuficiente. Tente novamente.");
  } else {
    saldo -= valor;
    historicoTransacoes.push({ tipo: "Saque", valor, data: new Date().toLocaleString() });
    console.log(`Saque de $${valor} realizado com sucesso.`);
  }
}

// Função para exibir o saldo atual
function verSaldo() {
  console.log(`Saldo atual: $${saldo}`);
}

// Função para exibir o histórico de transações
function verHistorico() {
  console.log("Histórico de Transações:");
  for (const transacao of historicoTransacoes) {
    console.log(`${transacao.tipo} de $${transacao.valor} em ${transacao.data}`);
  }
}

// Laço de repetição para exibir o menu e processar as opções
let opcao;
do {
  exibirMenu();
  opcao = Number(prompt("Escolha uma opção:"));

  switch (opcao) {
    case 1:
      depositar();
      break;
    case 2:
      sacar();
      break;
    case 3:
      verSaldo();
      break;
    case 4:
      verHistorico();
      break;
    case 5:
      console.log("Saindo do programa. Obrigado por usar nossos serviços!");
      break;
    default:
      console.log("Opção inválida. Tente novamente.");
  }
} while (opcao !== 5);
