# Azure-Cognitive-Search
Utilizando AI Search para indexação e consulta de Dados

Neste exemplo vamos criar uma solução de mineração de conhecimento que facilite a pesquisa de insights sobre as experiências do cliente, criando um índice de Pesquisa de IA do Azure e usando dados extraídos de avaliações de clientes para criar insghts sobre suas experiências.

Para tanto usaremos os seguintes passos:

__1 - Criar recursos do Azure necessários__

+ Recurso de Pesquisa de IA do Azure
+ Recurso de serviços de IA do Azure
+ Conta de armazenamento

[Para mais detalhes clique aqui.](https://microsoftlearning.github.io/mslearn-ai-fundamentals/Instructions/Labs/11-ai-search.html#azure-resources-needed)

__2 - Carregar documentos no Armazenamento do Azure__

[Para mais detalhes clique aqui.](https://microsoftlearning.github.io/mslearn-ai-fundamentals/Instructions/Labs/11-ai-search.html#upload-documents-to-azure-storage)


__3 - Indexar os documentos__

Depois de ter os documentos em armazenamento, poderemos usar o Azure AI Search para extrair insights dos documentos. O portal do Azure fornece um assistente de Importação de dados. Com esse assistente, criaremos automaticamente um índice e um indexador para fontes de dados com suporte. usaremos o assistente para criar um índice e importar seus documentos de pesquisa do armazenamento para o índice de Pesquisa de IA do Azure.

[Para mais detalhes clique aqui.](https://microsoftlearning.github.io/mslearn-ai-fundamentals/Instructions/Labs/11-ai-search.html#index-the-documents)


__4 - Consultar o índice__

Usaremos o Gerenciador de pesquisa para escrever e testar consultas. O explorador de pesquisa é uma ferramenta incorporada no portal do Azure que oferece uma maneira fácil de validar a qualidade do índice de pesquisa. Poderemos usar o Gerenciador de pesquisa para escrever consultas e revisar resultados em JSON.

Abaixo do índice selecionado, altere a exibição para JSON view, insira os itens a serem pesquisados e clique em "Pesquisar":

![imagem original](/inputs/search.png)

Como resultado, teremos a imagem a seguir, onde será exibido o número de itens encontrados em @odata.count, os textos das avaliações e as palavras-chave selecionadas.

![imagem original](/inputs/result.png)

[Para mais detalhes clique aqui.](https://microsoftlearning.github.io/mslearn-ai-fundamentals/Instructions/Labs/11-ai-search.html#query-the-index)

__5 - Revisar o repositório de conhecimento__

Ao executar o assistente Importar dados, também foi criado um repositório de conhecimento. Dentro do espaço de conhecimento, você encontraremos os dados enriquecidos extraídos pelas habilidades de IA na forma de projeções e tabelas.

[Para mais detalhes clique aqui.](https://microsoftlearning.github.io/mslearn-ai-fundamentals/Instructions/Labs/11-ai-search.html#review-the-knowledge-store)