# Git

* Ferramenta para realizar versionamento de arquivos, tipicamente utilizada para controle de versão de códigos fonte e até mesmo CI / CD de códigos fonte: https://git-scm.com/
    * Para saber mais dessa parte de Git enquanto ferramenta de deploy, recomendo fortemente acessar o canal LinuxTips no youtube do Jefferson Fernando

* Vou entrar aqui no meu github rapidinho para mostrar que o meu TCC da pós foi todo versionado no Git.

* Aproveitando, todos aqui sabem a diferença entre Git, Github e Gitlab? Basicamente Git é o sistema core de versionamento, enquanto o Github e Gitlab (tem também o Bitbucket e AWS Code Commit) funcionam como servidores para hospedar seus arquivos remotamente e permitir o acesso à esses arquivos (tanto por você quanto pela comunidade [contanto que o repo esteja público]), além de servirem como mecanismo de deploy (publicação nos ambientes): https://git-scm.com/book/en/v2/Getting-Started-About-Version-Control

* Em outras palavras, parafraseando minha esposa, ele pode ser usado como um "Google Drive para nerds"

* Falando um pouquinho da história do Git, nós vimos que a ideia é fazer um controle de versionamento... mas já não haviam outras ferramentas de versionamento de código? Sim, mas elas eram:
    * Complexas de manusear (até hoje, existem nas empresas a figura de gerente de configuração ou release management... num contexto de open source até faz sentido, mas num contexto enterprise isso pode até mesmo engessar os processos e atrasar os trabalhos em um projeto)
    * Lentas (Linus comentou que em uma thread de discussão típica dele, contendo uns 250 e-mails, levava 2 horas para subir) 
    * Não garantiam a integridade dos arquivos que iam para o servidor (por vezes, eles poderiam corromper), controle de versão feito arquivo a arquivo e não por snapshot

* Diante disso, o famoso programador e criador do Linux Linus Torvalds criou essa ferramenta, buscando velocidade, integridade e um sistema distribuído: https://git-scm.com/about/branching-and-merging 

* Porquê ele tem esse nome? A gente pode dar uma olhada no commit inicial do Git: https://initialcommit.com/blog/How-Did-Git-Get-Its-Name. Segundo o próprio Linus, ele é um cara egocêntrico e que gosta de batizar suas criações com seu próprio nome, daí "git" é uma gíria britânica para "arrogante" ou, em outras palavras, "o cara que se acha a última bolacha do pacote"
    * Apesar que ele realmente está num patamar extremamente elevado de programadores, é como se fosse o elo "Desafiante" no LOL

* Instalação do Git (next, next, finish) e verificando se o mesmo está instalado via `git --help`

* Comandos básicos (Github Git cheat sheet): https://education.github.com/git-cheat-sheet-education.pdf

* Em tradução livre, "cheat sheet" significa "cola", ou seja, é a "colinha" que algumas pessoas fazem na prova. No nosso mundo de programação, o uso de cheat sheets é extremamente comum e saudável (tem até caneca vendida com cheat sheet de git, basta pesquisar por "caneca comandos Git"), o ponto é que seu uso precisa ser justamente, o de uma "colinha" para não precisar ficar revisitando materiais, aulas e estudos mais pesados. Porém, se você simplesmente digitar comandos, sem ter consciência do que está sendo feito de fato por detrás dos panos, você simplesmente está sendo adestrado e caso tenha uma nova ferramenta você vai ter que esperar alguém aprender ela, montar um cheat sheet e ficar refém dele de novo... 
    * A bem da verdade, para ferramentas de SCM este cenário é improvável, mas para liguagens / plataformas de cloud é super provável

* Comandos básicos
    * global config
    * init
    * clone
    * status
    * add
    * reset
    * commit
    * push
    * agora vou fazer uma alteração remota no readme e depois fazer o pull (dúvida recorrente)
    * diff (temos também outras recomendações, como o Meld, visual studio code, IntelliJ)
        * Também é possível fazer a comparação de versões já commitadas no próprio github

* Branching e DAG
    * Branch vêm de ramificação, ou seja, será criado um "ambiente" separado para realização de alterações, uma vez que as alterações foram testadas e validadas, é submetido um pull request para a branch (ou "ambiente", desejado). É por isso que os git flows (que é este fluxo de você criar uma branch, depois juntar com outra branch) parecem mapas de metrô. Por trás, está sendo utilizada uma estrutura de dados conhecida como DAG (Direct Acyclic Graph: https://en.wikipedia.org/wiki/Directed_acyclic_graph)
        * É como se fosse um multiverso, com a diferença de que é possível unir as alterações de um ambiente para outro
    * Agora vou criar uma branch no IntelliJ, VS Code e no Terminal... simulando um ambiente de desenvolvimento segregado da main (antiga master)
    * Para criar uma branch, utilizar o comando `git branch <branch-name>`
    * Para acessar uma branch, utilizar `git checkout <branch-name>`
    * Para criar uma branch e já entrar nela, usar o `git checkout -b <branch-name>`
    * Fazer o commit e o push para mostrar que a branch "apareceu" no github

* Recursos avançados