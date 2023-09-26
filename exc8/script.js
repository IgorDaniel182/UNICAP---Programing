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
  
    setSaldo(saldo) {
      this.saldo = saldo;
    }
  
    sacar(valor) {
      if (valor > 0 && valor <= this.saldo) {
        this.saldo -= valor;
        return true;
      }
      return false;
    }
  
    depositar(valor) {
      if (valor > 0) {
        this.saldo += valor;
        return true;
      }
      return false;
    }
  }
  
  class ContaCorrente extends ContaBancaria {
    constructor(agencia, numero, saldo, cartaoCredito) {
      super(agencia, numero, 'Conta Corrente', saldo);
      this.cartaoCredito = cartaoCredito;
    }
  
    getCartaoCredito() {
      return this.cartaoCredito;
    }
  
    setCartaoCredito(cartaoCredito) {
      this.cartaoCredito = cartaoCredito;
    }
  }
  
  class ContaPoupanca extends ContaBancaria {
    constructor(agencia, numero, saldo) {
      super(agencia, numero, 'Conta Poupança', saldo);
    }
  }
  
  class ContaUniversitaria extends ContaBancaria {
    constructor(agencia, numero, saldo) {
      super(agencia, numero, 'Conta Universitária', saldo);
    }
  
    sacar(valor) {
      if (this.tipo === 'Conta Universitária' && valor <= 500 && valor <= this.saldo) {
        this.saldo -= valor;
        return true;
      }
      return false;
    }
  }
  
  const contaCorrente = new ContaCorrente('001', '12345', 1000, true);
  console.log('Saldo da Conta Corrente:', contaCorrente.getSaldo());
  
  const contaUniversitaria = new ContaUniversitaria('002', '67890', 800);
  console.log('Saldo da Conta Universitária:', contaUniversitaria.getSaldo());
  
  const saqueSucesso = contaUniversitaria.sacar(300);
  console.log('Saque na Conta Universitária:', saqueSucesso);
  console.log('Novo saldo da Conta Universitária:', contaUniversitaria.getSaldo());
  
  const saqueInvalido = contaUniversitaria.sacar(600);
  console.log('Tentativa de saque inválido na Conta Universitária:', saqueInvalido);
  console.log('Saldo da Conta Universitária após tentativa de saque inválido:', contaUniversitaria.getSaldo());
