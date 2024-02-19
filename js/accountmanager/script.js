class ContaBancaria {
    constructor(agencia, numero, tipo, saldo) {
        this.agencia = agencia;
        this.numero = numero;
        this.tipo = tipo;
        this.saldo = saldo;
    }

    getSaldo() {
        return this.saldo;
    }

    setSaldo(valor) {
        this.saldo = valor;
    }

    sacar(valor) {
        if (valor <= this.saldo) {
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    depositar(valor) {
        this.saldo += valor;
    }
}

class ContaCorrente extends ContaBancaria {
    constructor(agencia, numero, saldo, cartaoCredito) {
        super(agencia, numero, "Conta Corrente", saldo);
        this.cartaoCredito = cartaoCredito;
    }

    getCartaoCredito() {
        return this.cartaoCredito;
    }

    setCartaoCredito(possui) {
        this.cartaoCredito = possui;
    }
}

class ContaPoupanca extends ContaBancaria {
    constructor(agencia, numero, saldo) {
        super(agencia, numero, "Conta Poupança", saldo);
    }
}

class ContaUniversitaria extends ContaBancaria {
    constructor(agencia, numero, saldo) {
        super(agencia, numero, "Conta Universitária", saldo);
    }

    sacar(valor) {
        if (valor <= this.saldo && valor <= 500) {
            this.saldo -= valor;
            return true;
        }
        return false;
    }
}

const contas = [];

document.getElementById("inserir").addEventListener("click", () => {
    const agencia = document.getElementById("agencia").value;
    const numero = document.getElementById("numero").value;
    const tipo = document.getElementById("tipo").value;
    const saldo = parseFloat(document.getElementById("saldo").value);

    if (!agencia || !numero || isNaN(saldo)) {
        alert("Por favor, preencha todos os campos corretamente.");
        return;
    }

    let novaConta;
    if (tipo === "corrente") {
        novaConta = new ContaCorrente(agencia, numero, saldo, false);
    } else if (tipo === "poupanca") {
        novaConta = new ContaPoupanca(agencia, numero, saldo);
    } else if (tipo === "universitaria") {
        novaConta = new ContaUniversitaria(agencia, numero, saldo);
    }

    contas.push(novaConta);

    document.getElementById("agencia").value = "";
    document.getElementById("numero").value = "";
    document.getElementById("saldo").value = "";
    alert("Conta inserida com sucesso.");
});

document.getElementById("deletar").addEventListener("click", () => {
    const numero = prompt("Digite o número da conta que deseja deletar:");
    const contaIndex = contas.findIndex((conta) => conta.numero === numero);

    if (contaIndex !== -1) {
        contas.splice(contaIndex, 1);
        alert("Conta deletada com sucesso.");
    } else {
        alert("Conta não encontrada.");
    }
});

document.getElementById("visualizar").addEventListener("click", () => {
    const contasList = document.getElementById("contas-list");
    contasList.innerHTML = "";

    for (const conta of contas) {
        const listItem = document.createElement("li");
        listItem.textContent = `Agência: ${conta.agencia}, Número: ${conta.numero}, Tipo: ${conta.tipo}, Saldo: $${conta.saldo.toFixed(2)}`;
        contasList.appendChild(listItem);
    }
});
document.getElementById("inserir-nav").addEventListener("click", () => {
    document.querySelector(".left-pane").style.display = "block";
    document.querySelector(".right-pane").style.display = "none";
});

document.getElementById("visualizar-nav").addEventListener("click", () => {
    document.querySelector(".left-pane").style.display = "none";
    document.querySelector(".right-pane").style.display = "block";
});
