/**
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

package io.swagger.client.model


case class Ask (
  // 화폐를 의미하는 영문 대문자 코드
  currency: Option[String] = None,
  // 주문금액 단위
  priceUnit: Option[String] = None,
  // 최소 매도/매수 금액
  minTotal: Option[Number] = None
)
