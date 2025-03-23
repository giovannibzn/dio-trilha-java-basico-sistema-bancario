# 🏦 Sistema Bancário em Java 💰

Este projeto é uma simulação de um sistema bancário simples, desenvolvido em Java, que permite gerenciar contas correntes e poupanças. Ele foi criado como parte de um desafio para aplicar conceitos de **Programação Orientada a Objetos (POO)**, como **abstração**, **encapsulamento**, **herança** e **polimorfismo**.

---

## 📋 Funcionalidades

O sistema oferece as seguintes funcionalidades:

- **Criação de contas**:
    - ✅ Conta Corrente
    - ✅ Conta Poupança

- **Operações bancárias**:
    - 💵 **Depósito**: Adicionar dinheiro à conta.
    - 💸 **Saque**: Retirar dinheiro da conta (com validação de saldo).
    - 🔄 **Transferência**: Transferir dinheiro entre contas.

- **Extrato**:
    - 📄 Exibir informações da conta, incluindo saldo, tipo de conta e dados do cliente.

- **Gerenciamento de contas**:
    - 📋 Listar todas as contas cadastradas.

---

## 🛠️ Estrutura do Projeto

O projeto está organizado da seguinte forma:

```
📁 Banco
├── 📄 Banco.java      // Gerenciador de contas
├── 📄 Conta.java            // Interface com métodos básicos
├── 📄 ContaBase.java        // Classe abstrata com implementação comum
├── 📄 ContaCorrente.java    // Implementação de Conta Corrente
├── 📄 ContaPoupanca.java    // Implementação de Conta Poupança
├── 📄 Cliente.java          // Classe que representa um cliente
📄 Main.java                 // Classe principal para testes
```

---

## 🚀 Como Executar

1. **Clone o repositório**:
   ```bash
   git clone https://github.com/seu-usuario/sistema-bancario-java.git
   ```

2. **Navegue até o diretório do projeto**:
   ```bash
   cd sistema-bancario-java
   ```

3. **Compile e execute o projeto**:
   ```bash
   javac Banco/*.java Main.java
   java Main
   ```

---

## 🧩 Exemplo de Uso

Aqui está um exemplo de como usar o sistema:

```java
import Banco.Banco;
import Banco.ContaCorrente;
import Banco.ContaPoupanca;

public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();

        var neymar = new ContaCorrente("Neymar", "Junior");
        var messi = new ContaPoupanca("Lionel", "Messi");
        var cristiano = new ContaCorrente("Cristiano", "Ronaldo");
        var vini = new ContaPoupanca("Vinicius", "Jr");

        banco.adicionarConta(neymar);
        banco.adicionarConta(messi);
        banco.adicionarConta(cristiano);
        banco.adicionarConta(vini);

        banco.exibirContas();
        System.out.println();

        neymar.depositar(500);
        messi.depositar(800);
        cristiano.depositar(1000);
        neymar.transferir(300, vini);
        cristiano.transferir(250, neymar);
        vini.sacar(50);

        neymar.extrato();
        System.out.println();
        messi.extrato();
        System.out.println();
        cristiano.extrato();
        System.out.println();
        vini.extrato();
    }
}
```

### Saída Esperada:

```
===Lista de Contas===
Cliente: Neymar Junior        | Agencia: 1 | Número: 1 | Tipo: Conta Corrente
Cliente: Lionel Messi         | Agencia: 1 | Número: 2 | Tipo: Conta Poupança
Cliente: Cristiano Ronaldo    | Agencia: 1 | Número: 3 | Tipo: Conta Corrente
Cliente: Vinicius Jr          | Agencia: 1 | Número: 4 | Tipo: Conta Poupança

===Extrato===
Cliente: Neymar Junior
Agencia: 1
Conta Corrente: 1
Saldo: R$ 450,00

===Extrato===
Cliente: Lionel Messi
Agencia: 1
Conta Poupança: 2
Saldo: R$ 800,00

===Extrato===
Cliente: Cristiano Ronaldo
Agencia: 1
Conta Corrente: 3
Saldo: R$ 750,00

===Extrato===
Cliente: Vinicius Jr
Agencia: 1
Conta Poupança: 4
Saldo: R$ 250,00
```

---

## 🧠 Conceitos Aplicados

- **Abstração**: A interface `Conta` e as classes `ContaCorrente` e `ContaPoupanca` abstraem as funcionalidades de uma conta bancária.
- **Encapsulamento**: Atributos privados e métodos públicos garantem que a implementação interna esteja protegida.
- **Herança**: A classe `ContaBase` fornece uma implementação comum para `ContaCorrente` e `ContaPoupanca`.
- **Polimorfismo**: A interface `Conta` permite tratar `ContaCorrente` e `ContaPoupanca` de forma genérica.

---

## 📝 Melhorias Futuras

- Adicionar **taxas** para contas correntes e **rendimentos** para contas poupança.
- Implementar **tratamento de exceções** para operações inválidas (ex.: saldo insuficiente).
- Adicionar persistência de dados usando **arquivos** ou **banco de dados**.
- Criar uma interface gráfica para interação com o usuário.

---

## 🤝 Contribuição

Contribuições são bem-vindas! Sinta-se à vontade para abrir uma **issue** ou enviar um **pull request**.

---

Feito por [Giovanni Biazon](https://github.com/giovannibzn).
