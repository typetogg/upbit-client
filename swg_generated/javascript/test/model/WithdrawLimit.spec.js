/*
 * Upbit Open API
 * ## REST API for Upbit Exchange - Base URL: [https://api.upbit.com] - Official Upbit API Documents: [https://docs.upbit.com] - Official Support email: [open-api@upbit.com] 
 *
 * OpenAPI spec version: 1.1.6
 * Contact: ujhin942@gmail.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 *
 * Swagger Codegen version: 2.4.17
 *
 * Do not edit the class manually.
 *
 */

(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD.
    define(['expect.js', '../../src/index'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    factory(require('expect.js'), require('../../src/index'));
  } else {
    // Browser globals (root is window)
    factory(root.expect, root.UpbitOpenApi);
  }
}(this, function(expect, UpbitOpenApi) {
  'use strict';

  var instance;

  describe('(package)', function() {
    describe('WithdrawLimit', function() {
      beforeEach(function() {
        instance = new UpbitOpenApi.WithdrawLimit();
      });

      it('should create an instance of WithdrawLimit', function() {
        // TODO: update the code to test WithdrawLimit
        expect(instance).to.be.a(UpbitOpenApi.WithdrawLimit);
      });

      it('should have the property currency (base name: "currency")', function() {
        // TODO: update the code to test the property currency
        expect(instance).to.have.property('currency');
        // expect(instance.currency).to.be(expectedValueLiteral);
      });

      it('should have the property minimum (base name: "minimum")', function() {
        // TODO: update the code to test the property minimum
        expect(instance).to.have.property('minimum');
        // expect(instance.minimum).to.be(expectedValueLiteral);
      });

      it('should have the property onetime (base name: "onetime")', function() {
        // TODO: update the code to test the property onetime
        expect(instance).to.have.property('onetime');
        // expect(instance.onetime).to.be(expectedValueLiteral);
      });

      it('should have the property daily (base name: "daily")', function() {
        // TODO: update the code to test the property daily
        expect(instance).to.have.property('daily');
        // expect(instance.daily).to.be(expectedValueLiteral);
      });

      it('should have the property remainingDaily (base name: "remaining_daily")', function() {
        // TODO: update the code to test the property remainingDaily
        expect(instance).to.have.property('remainingDaily');
        // expect(instance.remainingDaily).to.be(expectedValueLiteral);
      });

      it('should have the property remainingDailyKrw (base name: "remaining_daily_krw")', function() {
        // TODO: update the code to test the property remainingDailyKrw
        expect(instance).to.have.property('remainingDailyKrw');
        // expect(instance.remainingDailyKrw).to.be(expectedValueLiteral);
      });

      it('should have the property fixed (base name: "fixed")', function() {
        // TODO: update the code to test the property fixed
        expect(instance).to.have.property('fixed');
        // expect(instance.fixed).to.be(expectedValueLiteral);
      });

      it('should have the property canWithdraw (base name: "can_withdraw")', function() {
        // TODO: update the code to test the property canWithdraw
        expect(instance).to.have.property('canWithdraw');
        // expect(instance.canWithdraw).to.be(expectedValueLiteral);
      });

    });
  });

}));