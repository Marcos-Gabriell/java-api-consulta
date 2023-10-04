package br.com.apicosulta.consultaapi.model;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class CnpjModel implements Serializable {

    @JsonProperty("razao_social")
    private String razaoSocial;

    @JsonProperty("nome_fantasia")
    private String nomeFantasia;


}