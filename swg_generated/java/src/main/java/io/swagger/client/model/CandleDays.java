/*
 * Upbit Open API
 * ## REST API for Upbit Exchange - Base URL: [https://api.upbit.com] - Official Upbit API Documents: [https://docs.upbit.com] - Official Support email: [open-api@upbit.com] 
 *
 * OpenAPI spec version: 1.0.0
 * Contact: ujhin942@gmail.com
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
import java.math.BigDecimal;

/**
 * CandleDays
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-01-25T00:42:40.509Z")
public class CandleDays {
  @SerializedName("market")
  private String market = null;

  @SerializedName("candle_date_time_utc")
  private String candleDateTimeUtc = null;

  @SerializedName("candle_date_time_kst")
  private String candleDateTimeKst = null;

  @SerializedName("opening_price")
  private Double openingPrice = null;

  @SerializedName("high_price")
  private Double highPrice = null;

  @SerializedName("low_price")
  private Double lowPrice = null;

  @SerializedName("trade_price")
  private Double tradePrice = null;

  @SerializedName("timestamp")
  private BigDecimal timestamp = null;

  @SerializedName("candle_acc_trade_price")
  private Double candleAccTradePrice = null;

  @SerializedName("candle_acc_trade_volume")
  private Double candleAccTradeVolume = null;

  @SerializedName("prev_closing_price")
  private Double prevClosingPrice = null;

  @SerializedName("change_price")
  private Double changePrice = null;

  @SerializedName("change_rate")
  private Double changeRate = null;

  @SerializedName("converted_trade_price")
  private Double convertedTradePrice = null;

  public CandleDays market(String market) {
    this.market = market;
    return this;
  }

   /**
   * 마켓명
   * @return market
  **/
  @ApiModelProperty(example = "KRW-BTC", value = "마켓명")
  public String getMarket() {
    return market;
  }

  public void setMarket(String market) {
    this.market = market;
  }

  public CandleDays candleDateTimeUtc(String candleDateTimeUtc) {
    this.candleDateTimeUtc = candleDateTimeUtc;
    return this;
  }

   /**
   * 캔들 기준 시각 (UTC 기준)
   * @return candleDateTimeUtc
  **/
  @ApiModelProperty(example = "", value = "캔들 기준 시각 (UTC 기준)")
  public String getCandleDateTimeUtc() {
    return candleDateTimeUtc;
  }

  public void setCandleDateTimeUtc(String candleDateTimeUtc) {
    this.candleDateTimeUtc = candleDateTimeUtc;
  }

  public CandleDays candleDateTimeKst(String candleDateTimeKst) {
    this.candleDateTimeKst = candleDateTimeKst;
    return this;
  }

   /**
   * 캔들 기준 시각 (KST 기준)
   * @return candleDateTimeKst
  **/
  @ApiModelProperty(example = "", value = "캔들 기준 시각 (KST 기준)")
  public String getCandleDateTimeKst() {
    return candleDateTimeKst;
  }

  public void setCandleDateTimeKst(String candleDateTimeKst) {
    this.candleDateTimeKst = candleDateTimeKst;
  }

  public CandleDays openingPrice(Double openingPrice) {
    this.openingPrice = openingPrice;
    return this;
  }

   /**
   * 시가
   * @return openingPrice
  **/
  @ApiModelProperty(example = "3.6478E7", value = "시가")
  public Double getOpeningPrice() {
    return openingPrice;
  }

  public void setOpeningPrice(Double openingPrice) {
    this.openingPrice = openingPrice;
  }

  public CandleDays highPrice(Double highPrice) {
    this.highPrice = highPrice;
    return this;
  }

   /**
   * 고가
   * @return highPrice
  **/
  @ApiModelProperty(example = "3.7379E7", value = "고가")
  public Double getHighPrice() {
    return highPrice;
  }

  public void setHighPrice(Double highPrice) {
    this.highPrice = highPrice;
  }

  public CandleDays lowPrice(Double lowPrice) {
    this.lowPrice = lowPrice;
    return this;
  }

   /**
   * 저가
   * @return lowPrice
  **/
  @ApiModelProperty(example = "3.4357E7", value = "저가")
  public Double getLowPrice() {
    return lowPrice;
  }

  public void setLowPrice(Double lowPrice) {
    this.lowPrice = lowPrice;
  }

  public CandleDays tradePrice(Double tradePrice) {
    this.tradePrice = tradePrice;
    return this;
  }

   /**
   * 종가
   * @return tradePrice
  **/
  @ApiModelProperty(example = "3.6005E7", value = "종가")
  public Double getTradePrice() {
    return tradePrice;
  }

  public void setTradePrice(Double tradePrice) {
    this.tradePrice = tradePrice;
  }

  public CandleDays timestamp(BigDecimal timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * 해당 캔들에서 마지막 틱이 저장된 시각
   * @return timestamp
  **/
  @ApiModelProperty(example = "1.609852095082E12", value = "해당 캔들에서 마지막 틱이 저장된 시각")
  public BigDecimal getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(BigDecimal timestamp) {
    this.timestamp = timestamp;
  }

  public CandleDays candleAccTradePrice(Double candleAccTradePrice) {
    this.candleAccTradePrice = candleAccTradePrice;
    return this;
  }

   /**
   * 누적 거래 금액
   * @return candleAccTradePrice
  **/
  @ApiModelProperty(example = "2.855317380959435E11", value = "누적 거래 금액")
  public Double getCandleAccTradePrice() {
    return candleAccTradePrice;
  }

  public void setCandleAccTradePrice(Double candleAccTradePrice) {
    this.candleAccTradePrice = candleAccTradePrice;
  }

  public CandleDays candleAccTradeVolume(Double candleAccTradeVolume) {
    this.candleAccTradeVolume = candleAccTradeVolume;
    return this;
  }

   /**
   * 누적 거래량
   * @return candleAccTradeVolume
  **/
  @ApiModelProperty(example = "7940.45654711", value = "누적 거래량")
  public Double getCandleAccTradeVolume() {
    return candleAccTradeVolume;
  }

  public void setCandleAccTradeVolume(Double candleAccTradeVolume) {
    this.candleAccTradeVolume = candleAccTradeVolume;
  }

  public CandleDays prevClosingPrice(Double prevClosingPrice) {
    this.prevClosingPrice = prevClosingPrice;
    return this;
  }

   /**
   * 전일 종가 (UTC 0시 기준)
   * @return prevClosingPrice
  **/
  @ApiModelProperty(example = "3.646E7", value = "전일 종가 (UTC 0시 기준)")
  public Double getPrevClosingPrice() {
    return prevClosingPrice;
  }

  public void setPrevClosingPrice(Double prevClosingPrice) {
    this.prevClosingPrice = prevClosingPrice;
  }

  public CandleDays changePrice(Double changePrice) {
    this.changePrice = changePrice;
    return this;
  }

   /**
   * 전일 종가 대비 변화 금액
   * @return changePrice
  **/
  @ApiModelProperty(example = "-455000.0", value = "전일 종가 대비 변화 금액")
  public Double getChangePrice() {
    return changePrice;
  }

  public void setChangePrice(Double changePrice) {
    this.changePrice = changePrice;
  }

  public CandleDays changeRate(Double changeRate) {
    this.changeRate = changeRate;
    return this;
  }

   /**
   * 전일 종가 대비 변화량
   * @return changeRate
  **/
  @ApiModelProperty(example = "-0.0124794295", value = "전일 종가 대비 변화량")
  public Double getChangeRate() {
    return changeRate;
  }

  public void setChangeRate(Double changeRate) {
    this.changeRate = changeRate;
  }

  public CandleDays convertedTradePrice(Double convertedTradePrice) {
    this.convertedTradePrice = convertedTradePrice;
    return this;
  }

   /**
   * 종가 환산 화폐 단위로 환산된 가격 (요청에 convertingPriceUnit 파라미터 없을 시 해당 필드 포함되지 않음.) 
   * @return convertedTradePrice
  **/
  @ApiModelProperty(value = "종가 환산 화폐 단위로 환산된 가격 (요청에 convertingPriceUnit 파라미터 없을 시 해당 필드 포함되지 않음.) ")
  public Double getConvertedTradePrice() {
    return convertedTradePrice;
  }

  public void setConvertedTradePrice(Double convertedTradePrice) {
    this.convertedTradePrice = convertedTradePrice;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CandleDays candleDays = (CandleDays) o;
    return Objects.equals(this.market, candleDays.market) &&
        Objects.equals(this.candleDateTimeUtc, candleDays.candleDateTimeUtc) &&
        Objects.equals(this.candleDateTimeKst, candleDays.candleDateTimeKst) &&
        Objects.equals(this.openingPrice, candleDays.openingPrice) &&
        Objects.equals(this.highPrice, candleDays.highPrice) &&
        Objects.equals(this.lowPrice, candleDays.lowPrice) &&
        Objects.equals(this.tradePrice, candleDays.tradePrice) &&
        Objects.equals(this.timestamp, candleDays.timestamp) &&
        Objects.equals(this.candleAccTradePrice, candleDays.candleAccTradePrice) &&
        Objects.equals(this.candleAccTradeVolume, candleDays.candleAccTradeVolume) &&
        Objects.equals(this.prevClosingPrice, candleDays.prevClosingPrice) &&
        Objects.equals(this.changePrice, candleDays.changePrice) &&
        Objects.equals(this.changeRate, candleDays.changeRate) &&
        Objects.equals(this.convertedTradePrice, candleDays.convertedTradePrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(market, candleDateTimeUtc, candleDateTimeKst, openingPrice, highPrice, lowPrice, tradePrice, timestamp, candleAccTradePrice, candleAccTradeVolume, prevClosingPrice, changePrice, changeRate, convertedTradePrice);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CandleDays {\n");
    
    sb.append("    market: ").append(toIndentedString(market)).append("\n");
    sb.append("    candleDateTimeUtc: ").append(toIndentedString(candleDateTimeUtc)).append("\n");
    sb.append("    candleDateTimeKst: ").append(toIndentedString(candleDateTimeKst)).append("\n");
    sb.append("    openingPrice: ").append(toIndentedString(openingPrice)).append("\n");
    sb.append("    highPrice: ").append(toIndentedString(highPrice)).append("\n");
    sb.append("    lowPrice: ").append(toIndentedString(lowPrice)).append("\n");
    sb.append("    tradePrice: ").append(toIndentedString(tradePrice)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    candleAccTradePrice: ").append(toIndentedString(candleAccTradePrice)).append("\n");
    sb.append("    candleAccTradeVolume: ").append(toIndentedString(candleAccTradeVolume)).append("\n");
    sb.append("    prevClosingPrice: ").append(toIndentedString(prevClosingPrice)).append("\n");
    sb.append("    changePrice: ").append(toIndentedString(changePrice)).append("\n");
    sb.append("    changeRate: ").append(toIndentedString(changeRate)).append("\n");
    sb.append("    convertedTradePrice: ").append(toIndentedString(convertedTradePrice)).append("\n");
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

