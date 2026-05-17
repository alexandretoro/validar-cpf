# Validador de CPF

Aplicativo desenvolvido em Java (JDK 25) que lê um CPF digitado pelo usuário e valida se ele é **válido** ou **inválido** com base no algoritmo oficial da Receita Federal Brasileira.

---

## 📋 Objetivo

Implementar e compreender o algoritmo de validação do CPF (Cadastro de Pessoa Física), aplicando conceitos de:

- Leitura de dados com `readln()` (API `java.lang.IO` — JDK 25)
- Estruturas de decisão (`if / else`)
- Laços de repetição (`for`)
- Manipulação de `String` e conversão de tipos

---

## 🗂️ Arquivos do repositório

| Arquivo | Descrição |
|---|---|
| `validador_cpf.java` | Código-fonte do aplicativo |
| `Apresentação_Validador_CPF.pptx` | Algoritmo de validação explicado em detalhes |
| `README.md` | Este arquivo |

---

## ▶️ Como executar

### Pré-requisitos

- Java JDK 25 instalado
- Terminal (CMD, PowerShell, ou terminal Linux/macOS)

### Execução

```bash
java validador_cpf.java
```

> O JDK 25 suporta execução direta de arquivos-fonte via **Unnamed Classes**, sem necessidade de compilação prévia com `javac`.

### Exemplo de uso

```
Por favor, informe seu CPF. Use apenas números:
52998224725
CPF válido!
```

```
Por favor, informe seu CPF. Use apenas números:
12345678900
CPF inválido!
```

---

## 🔍 Como o algoritmo funciona

O CPF é composto por **11 dígitos**. Os dois últimos são chamados de **dígitos verificadores** e são calculados matematicamente a partir dos 9 primeiros.

### Etapa 1 — Verificar o tamanho

O programa verifica se o CPF possui exatamente 11 dígitos. Caso contrário, já é considerado inválido.

### Etapa 2 — Calcular o 1º dígito verificador

Multiplica cada um dos 9 primeiros dígitos por um peso decrescente (de 10 a 2), soma os resultados e aplica a regra do módulo 11:

```
resto = soma % 11
se resto < 2  →  1º dígito verificador = 0
senão         →  1º dígito verificador = 11 - resto
```

### Etapa 3 — Calcular o 2º dígito verificador

Multiplica os 10 primeiros dígitos (incluindo o 1º dígito verificador) por pesos de 11 a 2, soma e aplica a mesma regra do módulo 11.

### Etapa 4 — Comparar e exibir o resultado

Se os dois dígitos calculados forem iguais aos dígitos nas posições 9 e 10 do CPF informado → **CPF válido!**  
Caso contrário → **CPF inválido!**

---

## 🛠️ Tecnologias utilizadas

- **Java JDK 25**
- **IntelliJ IDEA Community Edition**
- **`java.lang.IO`** — API de I/O simplificada introduzida no JDK 25, que disponibiliza os métodos `println()` e `readln()` sem necessidade de importar `Scanner` ou usar `System.out`
- **Sintaxe simplificada do JDK 25** — permite escrever `void main()` diretamente, sem declarar uma classe, o que torna o código mais enxuto para programas pequenos

---

## 📚 Disciplina

Algoritmos e Lógica de Programação com Java — Escola Senai Suíço Brasilieira
