#import <Foundation/Foundation.h>
#import "SWGObject.h"

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





@protocol SWGTrade
@end

@interface SWGTrade : SWGObject

/* 마켓의 유일 키 [optional]
 */
@property(nonatomic) NSString* market;
/* 체결의 고유 아이디 [optional]
 */
@property(nonatomic) NSString* uuid;
/* 체결 가격 [optional]
 */
@property(nonatomic) NSString* price;
/* 체결 양 [optional]
 */
@property(nonatomic) NSString* volume;
/* 체결된 총 가격 [optional]
 */
@property(nonatomic) NSString* funds;
/* 체결 종류 [optional]
 */
@property(nonatomic) NSString* side;
/* 체결 시각 [optional]
 */
@property(nonatomic) NSString* createdAt;

@end
