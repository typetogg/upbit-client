/**
 * Upbit Open API
 * ## REST API for Upbit Exchange - Base URL: [https://api.upbit.com] - Official Upbit API Documents: [https://docs.upbit.com] - Official Support email: [open-api@upbit.com] 
 *
 * OpenAPI spec version: 1.0.0
 * Contact: ujhin942@gmail.com
 *
 * NOTE: This class is auto generated by the swagger code generator 2.4.18.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

/*
 * Error.h
 *
 * 
 */

#ifndef IO_SWAGGER_CLIENT_MODEL_Error_H_
#define IO_SWAGGER_CLIENT_MODEL_Error_H_


#include "../ModelBase.h"

#include "ErrorInfo.h"

namespace io {
namespace swagger {
namespace client {
namespace model {

/// <summary>
/// 
/// </summary>
class  Error
    : public ModelBase
{
public:
    Error();
    virtual ~Error();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    void fromJson(web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    void fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// Error members

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ErrorInfo> getError() const;
    bool errorIsSet() const;
    void unsetError();
    void setError(std::shared_ptr<ErrorInfo> value);

protected:
    std::shared_ptr<ErrorInfo> m_Error;
    bool m_ErrorIsSet;
};

}
}
}
}

#endif /* IO_SWAGGER_CLIENT_MODEL_Error_H_ */