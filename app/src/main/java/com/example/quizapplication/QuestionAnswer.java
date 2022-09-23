package com.example.quizapplication;

public class QuestionAnswer {

    public static String question[]={
            "Por quanto tempo voce pretende deixar seu dinheiro investido?",
            "Qual o objetivo desse investimento?",
            "Qual das alternativas melhor classifica sua formacao e expericiencia com o mercado financeiro?",
            "Considerando seus rendimentos regulares, qual a porcentagem voce pretende reservar para aplicacoes financeiras?",
            "Caso as suas aplicaçoes sofressem uma queda superior a 30%, o que voce faria?",
            "Como está distribuido o seu patrimonio?",
            "Em relaçao as aplicacoes e rendimentos, em qual dessas situaçoes voce se enquadra?",
            "Qual sua faixa de renda mensal média?",
            "Qual o valor aproximado do deu patrimonio?",

    };

    public static String choices[][] = {
            {"Menos de 6 meses","Entre 6 meses e 1 ano", "Entre 1 ano e 3 anos", "Acima de 3 anos"},
            {"Preservaçao do capital para nao perder valor ao longo do tempo, assumindo baixos riscos de perdas","Aumento gradual do capital ao longo do tempo, assumindo riscos moderados", "Aumento do capital acima da taxa de retorno medio do mercado, mesmo que isso implique assumir riscos de perdas elevadas", "Obter no curto prazo retornos elevados e significativamente acima da taxa de retorno media do mercado, assumindo riscos elevados."},
            {"Não possuo formação acadêmica ou conhecimento do mercado financeiro", "Possuo formação acadêmica na área financeira, mas não tenho experiência com o mercado financeiro", "Possuo formação acadêmica em outra área, mas possuo conhecimento do mercado financeiro", "Possuo formação acadêmica na área financeira ou pleno conhecimento do mercado financeiro"},
            {"No máximo 25%", "Entre 25,01 e 50%", "Acima de 50%","nda"},
            {"Resgataria toda a aplicação e aplicaria na poupança","Manteria aplicação aguardando uma melhora do mercado", "Aumentaria a aplicação para aproveitar as oportunidades do mercado","nda"},
            {"Meu patrimônio não está aplicado ou está todo aplicado em renda fixa e/ou imóveis", "Menos de 25% em renda variável e o restante em renda fixa e/ou imóveis", "Entre 25,01 e 50% aplicado em renda variável e o restante em renda fixa e/ou imóveis", "Acima de 50% em renda variável"},
            {"Conto com o rendimento dessas aplicações para complementar minha renda mensal", "Eventualmente posso resgatar parte das aplicações para fazer frente aos meus gastos. Contudo, não tenho intenção de resgatar no curto prazo e pretendo fazer aplicações regulares", "Não tenho intenção de resgatar no curto prazo, mas não pretendo realizar novas aplicações", "Não tenho intenção de resgatar no curto prazo e ainda pretendo fazer aplicações regulares"},
            {"Até R$ 1.000","De R$ 1.001 até R$ 5.000", "De R$ 5.001 até R$ 10.000", "Acima de R$ 10.000"},
            { "De R$ 10.001 até R$ 100.000", "De R$ 100.001 até R$ 500.000", "De R$ 500.001 até R$ 1.000.000", "Acima de R$ 1.000.001"}
    };

    public static int[][] correctAnswers = {
            {0, 2, 3, 4},
            {0, 2, 4, 5},
            {0, 1, 2, 4},
            {0, 2, 4, 0},
            {0, 2, 4, 0},
            {0, 2, 3, 4},
            {0, 2, 3, 4},
            {0, 1, 2, 4},
            {1, 2, 4,5},

    };

}
