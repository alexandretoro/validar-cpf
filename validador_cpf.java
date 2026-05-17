

import static java.lang.IO.*;

void main() {
    String cpf = String.format(readln("Por favor, informe seu CPF. Use apenas números:\n"));
    int total_digitos = cpf.length();
    int soma_digitos = 0;
    int soma_valores = 0;
    if (total_digitos != 11){
        println("O CPF digitado é inválido. Ele não possui os 11 dígitos necessários para verificação.\nExecute novamente a aplicação e entre com outro número de CPF");
    } else {

        /*==================================================================================================*/
        //Calcula o primeiro dígito verificador e compara com o do CPF digitado
        for (int i = 0; i < 9; i++){
            int index = Integer.parseInt((String.valueOf(cpf.charAt(i))));
            int multiplicador = 10 - i;
            soma_digitos = soma_digitos + index * multiplicador;
            //println(index + " * " + multiplicador + " = " + (index * multiplicador));
        }
//        println("A multiplicação dos valores de 10 a 2, pelos dígitos do CPF, quando somadas, resulta em:" + soma_digitos);

        //O cálculo abaixo obtém o primeiro dígito verificador do CPF e na sequência compara com o primeiro dígito verificador do CPF digitado.
        int resto = soma_digitos % 11;
        int primeiro_digito_verificador = 11 - resto;

        if (primeiro_digito_verificador < 2){
            primeiro_digito_verificador = 0;
        }
//        println(primeiro_digito_verificador);




    /*==================================================================================================*/

        //Calcula o segundo dígito verificador e compara com o do CPF digitado
        for (int i = 0; i < 10; i++){
            int index = Integer.parseInt((String.valueOf(cpf.charAt(i))));
            int multiplicador = 11 - i;
            soma_valores = soma_valores + index * multiplicador;
            //println(index + " * " + multiplicador + " = " + (index * multiplicador));
        }
//        println("A multiplicação dos valores de 11 a 2, pelos dígitos do CPF, quando somadas, resulta em:" + soma_valores);

        //O cálculo abaixo obtém o segundo dígito verificador do CPF e na sequência compara com o segundo dígito verificador do CPF digitado.
        int resto_2 = soma_valores % 11;
        int segundo_digito_verificador = 11 - resto_2;

        if (segundo_digito_verificador < 2){
            segundo_digito_verificador = 0;
        }

//        println(segundo_digito_verificador);

        //Verifica se os dígitos verificadores do CPF digitado é igual ao primeiro_digito_verificador e segundo_digito_verificador encontrados na condição das linhas acima
//
        if (primeiro_digito_verificador == Integer.parseInt(String.valueOf(cpf.charAt(9))) && segundo_digito_verificador == Integer.parseInt(String.valueOf(cpf.charAt(10)))) {
            println("CPF válido!");
        } else {
            println("CPF inválido!");
        }
    }

}
