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


package io.swagger.client.api;

import io.swagger.client.ApiException;
import java.math.BigDecimal;
import io.swagger.client.model.Error;
import io.swagger.client.model.Withdraw;
import io.swagger.client.model.WithdrawChance;
import io.swagger.client.model.WithdrawCoin;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for WithdrawApi
 */
@Ignore
public class WithdrawApiTest {

    private final WithdrawApi api = new WithdrawApi();

    
    /**
     * 출금 가능 정보
     *
     * ## 해당 통화의 가능한 출금 정보를 확인한다. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void withdrawChanceTest() throws ApiException {
        String currency = null;
        WithdrawChance response = api.withdrawChance(currency);

        // TODO: test validations
    }
    
    /**
     * 코인 출금하기
     *
     * ## 코인 출금을 요청한다. **NOTE**: 바로출금 이용 시 유의사항 업비트 회원의 주소가 아닌 주소로 바로출금을 요청하는 경우, 출금이 정상적으로 수행되지 않습니다. 반드시 주소를 확인 후 출금을 진행하시기 바랍니다. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void withdrawCoinTest() throws ApiException {
        String currency = null;
        String amount = null;
        String address = null;
        String secondaryAddress = null;
        String transactionType = null;
        WithdrawCoin response = api.withdrawCoin(currency, amount, address, secondaryAddress, transactionType);

        // TODO: test validations
    }
    
    /**
     * 개별 출금 조회
     *
     * ## 출금 UUID를 통해 개별 출금 정보를 조회한다. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void withdrawInfoTest() throws ApiException {
        String uuid = null;
        String txid = null;
        String currency = null;
        Withdraw response = api.withdrawInfo(uuid, txid, currency);

        // TODO: test validations
    }
    
    /**
     * 출금 리스트 조회
     *
     * ## 출금 리스트를 조회한다. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void withdrawInfoAllTest() throws ApiException {
        String currency = null;
        String state = null;
        List<String> uuids = null;
        List<String> txids = null;
        BigDecimal limit = null;
        BigDecimal page = null;
        String orderBy = null;
        List<Withdraw> response = api.withdrawInfoAll(currency, state, uuids, txids, limit, page, orderBy);

        // TODO: test validations
    }
    
    /**
     * 원화 출금하기
     *
     * ## 원화 출금을 요청한다. 등록된 출금 계좌로 출금된다. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void withdrawKrwTest() throws ApiException {
        String amount = null;
        Withdraw response = api.withdrawKrw(amount);

        // TODO: test validations
    }
    
}
