--[[
  Upbit Open API
 
  ## REST API for Upbit Exchange - Base URL: [https://api.upbit.com] - Official Upbit API Documents: [https://docs.upbit.com] - Official Support email: [open-api@upbit.com] 
 
  OpenAPI spec version: 1.0.0
  Contact: ujhin942@gmail.com
  Generated by: https://github.com/swagger-api/swagger-codegen.git
]]

-- withdraw_coin class
local withdraw_coin = {}
local withdraw_coin_mt = {
	__name = "withdraw_coin";
	__index = withdraw_coin;
}

local function cast_withdraw_coin(t)
	return setmetatable(t, withdraw_coin_mt)
end

local function new_withdraw_coin(type, uuid, currency, txid, state, created_at, done_at, amount, fee, krw_amount, transaction_type)
	return cast_withdraw_coin({
		["type"] = type;
		["uuid"] = uuid;
		["currency"] = currency;
		["txid"] = txid;
		["state"] = state;
		["created_at"] = created_at;
		["done_at"] = done_at;
		["amount"] = amount;
		["fee"] = fee;
		["krw_amount"] = krw_amount;
		["transaction_type"] = transaction_type;
	})
end

return {
	cast = cast_withdraw_coin;
	new = new_withdraw_coin;
}
