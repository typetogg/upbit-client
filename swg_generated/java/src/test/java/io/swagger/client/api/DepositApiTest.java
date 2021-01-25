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
import io.swagger.client.model.Deposit;
import io.swagger.client.model.DepositCompleteResponse;
import io.swagger.client.model.DepositTransferResponse;
import io.swagger.client.model.Error;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DepositApi
 */
@Ignore
public class DepositApiTest {

    private final DepositApi api = new DepositApi();

    
    /**
     * 개별 입금 주소 조회
     *
     * ## 개별 입금 주소 조회 **NOTE**: 입금 주소 조회 요청 API 유의사항 입금 주소 생성 요청 이후 아직 발급되지 않은 상태일 경우 deposit_address가 null일 수 있습니다. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void depositCoinAddressTest() throws ApiException {
        String currency = null;
        DepositCompleteResponse response = api.depositCoinAddress(currency);

        // TODO: test validations
    }
    
    /**
     * 전체 입금 주소 조회
     *
     * ## 내가 보유한 자산 리스트를 보여줍니다. **NOTE**: 입금 주소 조회 요청 API 유의사항 입금 주소 생성 요청 이후 아직 발급되지 않은 상태일 경우 deposit_address가 null일 수 있습니다. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void depositCoinAddressesTest() throws ApiException {
        Object response = api.depositCoinAddresses();

        // TODO: test validations
    }
    
    /**
     * 입금 주소 생성 요청
     *
     * 입금 주소 생성을 요청한다. **NOTE**: 입금 주소 생성 요청 API 유의사항 입금 주소의 생성은 서버에서 비동기적으로 이뤄집니다. 비동기적 생성 특성상 요청과 동시에 입금 주소가 발급되지 않을 수 있습니다. 주소 발급 요청 시 결과로 Response1이 반환되며 주소 발급 완료 이전까지 계속 Response1이 반환됩니다. 주소가 발급된 이후부터는 새로운 주소가 발급되는 것이 아닌 이전에 발급된 주소가 Response2 형태로 반환됩니다. 정상적으로 주소가 생성되지 않는다면 일정 시간 이후 해당 API를 다시 호출해주시길 부탁드립니다. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void depositGenerateCoinAddressTest() throws ApiException {
        String currency = null;
        DepositCompleteResponse response = api.depositGenerateCoinAddress(currency);

        // TODO: test validations
    }
    
    /**
     * 개별 입금 조회
     *
     * ## 개별 입금 조회 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void depositInfoTest() throws ApiException {
        String uuid = null;
        String txid = null;
        String currency = null;
        Deposit response = api.depositInfo(uuid, txid, currency);

        // TODO: test validations
    }
    
    /**
     * 입금 리스트 조회
     *
     * ## 입금 리스트 조회 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void depositInfoAllTest() throws ApiException {
        String currency = null;
        String state = null;
        List<String> uuids = null;
        List<String> txids = null;
        BigDecimal limit = null;
        BigDecimal page = null;
        String orderBy = null;
        List<Deposit> response = api.depositInfoAll(currency, state, uuids, txids, limit, page, orderBy);

        // TODO: test validations
    }
    
}
