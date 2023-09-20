
package javasort;
//import java.lang.Comparable;
public class Dados implements Comparable<Dados>{
   private String data;
   private String horario;
   private String uf;
   private int br;
   private String municipio;
   private String causa;
   private String tipo;
   private String classificacao;
   private String faseDia;
   private String condicoesMetereologicas;
   private int quantVeiculos; 

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public int getBr() {
        return br;
    }

    public void setBr(int br) {
        this.br = br;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getCausa() {
        return causa;
    }

    public void setCausa(String causa) {
        this.causa = causa;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }

    public String getFaseDia() {
        return faseDia;
    }

    public void setFaseDia(String faseDia) {
        this.faseDia = faseDia;
    }

    public String getCondicoesMetereologicas() {
        return condicoesMetereologicas;
    }

    public void setCondicoesMetereologicas(String condicoesMetereologicas) {
        this.condicoesMetereologicas = condicoesMetereologicas;
    }

    public int getQuantVeiculos() {
        return quantVeiculos;
    }

    public void setQuantVeiculos(int quantVeiculos) {
        this.quantVeiculos = quantVeiculos;
    }


    @Override    
    public int compareTo(Dados outroDado){
      return this.getMunicipio().compareTo(outroDado.getMunicipio());
    }
     
    //implementar o equals
    @Override
    public boolean equals(Object o) {
        if (this == o) 
            return true;
        if (o == null || getClass() != o.getClass()) 
            return false;
        Dados dados = (Dados) o;
        return municipio.equals(dados.municipio);
    }

    @Override
    public String toString(){
        return getMunicipio()+ " : " + getUf() ;
    }// fim toString
    
    
}
