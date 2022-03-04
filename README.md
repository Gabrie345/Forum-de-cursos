
# POST/auth (autenticar)
    body:{
        "email": "string",
        "senha": "string"
    }

# GET /topicos (listar)

# POST /topicos (cadastrar)
    Authorization : Bearer Token;
    body: {
        "mensagem": "string",
        "nomeCurso": "string",
        "titulo": "string"
    }

# GET /topicos/id (detalhar)
    Authorization : Bearer Token;

# PUT/topicos (atualizar)
    Authorization : Bearer Token;
    body: {
        "mensagem": "string",
        "titulo": "string"
    }

# DELETE/topicos/id (detalhar)
    Authorization : Bearer Token;

   


