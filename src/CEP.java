public class CEP {
    private String cep;
    private String logradouro;
    private String complemento;
    private String unidade;
    private String localidade;
    private String bairro;
    private String uf;

    public CEP(String cep, String logradouro, String unidade, String complemento, String bairro, String uf, String localidade) {
        this.cep = cep;
        this.logradouro = logradouro;
        this.unidade = unidade;
        this.complemento = complemento;
        this.bairro = bairro;
        this.uf = uf;
        this.localidade = localidade;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getLocalidade() {
        return localidade;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    @Override
    public String toString() {
        return "Cep: " + cep
                + ", Logradouro: " + logradouro
                + ", Complemento: " + complemento
                + ", Unidade: " + unidade
                + ", Localidade: " + localidade
                + ", Bairro: " + bairro
                + ", UF: " + uf;
    }
}
