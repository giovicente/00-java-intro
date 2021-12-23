## Diagrama de Classes e UML
* UML e diagrama de classes
    * UML foi criada por Jacob, Rumbaugh e Booch na década de 90
    * Surgiu em um contexto que aplicações corporativas estavam aumentando em complexidade e criticidade
    * Por conta disso, foi criado um padrão tanto de modelagem como de implementação (a princípio parece que a UML está  muito descolada da parte prática de programação, mas conceitos como subsistemas / módulos, sendo que cada módulo é um caso de uso foram aplicados em contextos e projetos corporativos do mundo real)
    * Além disso, temos que considerar que antigamente o custo e tempo para debug eram muito altos, então a precisão da modelagem tinha que ser muito grande, muito próxima mesmo àquilo que será implementado, hoje se o foco for fazer assim, podemos perder o famoso "time to market", que é o nome bonito para "o Nubank lançou primeiro e perdemos uma captação de clientes..."
* Optamos por por visualizar a implementação e o raciocínio após verificar como as coisas funcionam na prática (reforçando que programação é uma profissão de prática). Comentar que o "nome bonito" do que estamos fazendo é engenharia reversa e em certo ponto até mesmo Arqueologia de Código.
* Comentar que o diagrama de classes ajuda muito na estruturação do raciocínio da quebra das responsabilidades e interação entre as classes, além de ser agnóstico a linguagem e nos ajudar a "pensar orientado a objetos"
* Depois, falar da parte "técnica" da elaboração do diagrama usando o projeto dos carros como exemplo
    * Falar das seções das classes: Nome, Atributos e Operações
        * \+ (public) | - (private) | \# (protected) | ~ (default)
    * Falar dos relacionamentos entre as classes (associações e herança)
    * Falar da Interface e de como chamá-la no diagrama de classes
    * Falar também das classes abstratas, representadas em itálico
    * Comentar sobre os métodos e atributos estáticos (Impressora), que são representados de forma sublinhada
* Encerrar falando um pouco que a utilização ou não depende do contexto e do bom senso, e falar um pouquinho do manifesto ágil - https://agilemanifesto.org/