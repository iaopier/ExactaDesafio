/*
 * Gastos API REST
 * API REST de cadastro de gastos
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;

/**
 * Gasto
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-05T21:24:49.131Z")
public class Gasto {
  @SerializedName("dataHora")
  private OffsetDateTime dataHora = null;

  @SerializedName("descricao")
  private String descricao = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("nomePessoa")
  private String nomePessoa = null;

  @SerializedName("tags")
  private String tags = null;

  @SerializedName("valor")
  private Double valor = null;

  public Gasto dataHora(OffsetDateTime dataHora) {
    this.dataHora = dataHora;
    return this;
  }

   /**
   * Get dataHora
   * @return dataHora
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getDataHora() {
    return dataHora;
  }

  public void setDataHora(OffsetDateTime dataHora) {
    this.dataHora = dataHora;
  }

  public Gasto descricao(String descricao) {
    this.descricao = descricao;
    return this;
  }

   /**
   * Get descricao
   * @return descricao
  **/
  @ApiModelProperty(value = "")
  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public Gasto id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Gasto nomePessoa(String nomePessoa) {
    this.nomePessoa = nomePessoa;
    return this;
  }

   /**
   * Get nomePessoa
   * @return nomePessoa
  **/
  @ApiModelProperty(value = "")
  public String getNomePessoa() {
    return nomePessoa;
  }

  public void setNomePessoa(String nomePessoa) {
    this.nomePessoa = nomePessoa;
  }

  public Gasto tags(String tags) {
    this.tags = tags;
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @ApiModelProperty(value = "")
  public String getTags() {
    return tags;
  }

  public void setTags(String tags) {
    this.tags = tags;
  }

  public Gasto valor(Double valor) {
    this.valor = valor;
    return this;
  }

   /**
   * Get valor
   * @return valor
  **/
  @ApiModelProperty(value = "")
  public Double getValor() {
    return valor;
  }

  public void setValor(Double valor) {
    this.valor = valor;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Gasto gasto = (Gasto) o;
    return Objects.equals(this.dataHora, gasto.dataHora) &&
        Objects.equals(this.descricao, gasto.descricao) &&
        Objects.equals(this.id, gasto.id) &&
        Objects.equals(this.nomePessoa, gasto.nomePessoa) &&
        Objects.equals(this.tags, gasto.tags) &&
        Objects.equals(this.valor, gasto.valor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataHora, descricao, id, nomePessoa, tags, valor);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Gasto {\n");
    
    sb.append("    dataHora: ").append(toIndentedString(dataHora)).append("\n");
    sb.append("    descricao: ").append(toIndentedString(descricao)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    nomePessoa: ").append(toIndentedString(nomePessoa)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    valor: ").append(toIndentedString(valor)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

