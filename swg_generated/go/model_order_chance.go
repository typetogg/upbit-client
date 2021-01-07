/*
 * Upbit Open API
 *
 * ## REST API for Upbit Exchange - Base URL: [https://api.upbit.com] - Official Upbit API Documents: [https://docs.upbit.com] - Official Support email: [open-api@upbit.com] 
 *
 * API version: 1.1.6
 * Contact: ujhin942@gmail.com
 * Generated by: Swagger Codegen (https://github.com/swagger-api/swagger-codegen.git)
 */

package swagger

type OrderChance struct {
	// 매수 수수료 비율
	BidFee string `json:"bid_fee,omitempty"`
	// 매도 수수료 비율
	AskFee string `json:"ask_fee,omitempty"`
	Market *Market `json:"market,omitempty"`
}