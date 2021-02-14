package exercicio_4.Entities;

import java.util.Calendar;

public class Fatura {

  private Double valor;
  private Calendar dataEmissão;
  private Calendar dataVencimento;

  public Fatura(Double valor, Calendar dataEmissão) {
    this.valor = valor;
    this.dataEmissão = dataEmissão;
  }

  public Double getValor() {
    return valor;
  }

  public void setValor(Double valor) {
    this.valor = valor;
  }

  public Calendar getDataEmissão() {
    return dataEmissão;
  }

  public void setDataEmissão() {
    this.dataEmissão = dataEmissão;
  }

  public Calendar getDataVencimento() {
    return dataVencimento;
  }

  public void setDataVencimento(Calendar dataEmissao) {
    this.dataVencimento = dataEmissao;
    dataEmissao.add(Calendar.DATE, 10);
    if (dataEmissao.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY) {
      dataEmissao.add(Calendar.DATE, 2);
      this.dataVencimento = dataEmissao;
    } else if (dataEmissao.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
      dataEmissao.add(Calendar.DATE, 1);
      this.dataVencimento = dataEmissao;
    }
  }
}
