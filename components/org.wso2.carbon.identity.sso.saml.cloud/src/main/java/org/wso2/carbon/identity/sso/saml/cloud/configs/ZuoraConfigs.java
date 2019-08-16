/*
 * Copyright (c) 2016, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 *  Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.identity.sso.saml.cloud.configs;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.wso2.carbon.identity.application.common.model.Property;
import org.wso2.carbon.identity.application.mgt.AbstractInboundAuthenticatorConfig;
import org.wso2.carbon.identity.base.IdentityConstants;
import org.wso2.carbon.identity.sso.saml.cloud.SAMLSSOConstants;

public class ZuoraConfigs extends AbstractInboundAuthenticatorConfig {

    private static final Log log = LogFactory.getLog(ZuoraConfigs.class);
    //This is the key
    @Override
    public String getAuthKey() {
        return null;
    }

    @Override
    public String getConfigName() {
        return "zuora";
    }

    //this is the authType
    @Override
    public String getName() {
        return SAMLSSOConstants.SAMLFormFields.SAML_SSO;
    }

    @Override
    public String getFriendlyName() {
        return "Zuora";
    }

    @Override
    public Property[] getConfigurationProperties() {
        Property issuer = new Property();
        issuer.setName(SAMLSSOConstants.SAMLFormFields.ISSUER);
        issuer.setValue("https://www.zuora.com");
        issuer.setDisplayName("Issuer");

        Property appType = new Property();
        appType.setName(IdentityConstants.ServerConfig.WELLKNOWN_APPLICATION_TYPE);
        appType.setType("hidden");
        appType.setValue(getConfigName());
        appType.setDisplayName("UI Config Type");

        Property acsurls = new Property();
        acsurls.setName(SAMLSSOConstants.SAMLFormFields.ACS_URLS);
        acsurls.setValue("https://www.zuora.com/apps/saml/SSO/alias/defaultAlias,https://apisandbox.zuora" +
                ".com/apps/saml/SSO/alias/defaultAlias");
        acsurls.setDisplayName("Assertion Consumer URLs");
        acsurls.setDescription("The url where you should redirected after authenticated.");

        Property defaultacs = new Property();
        defaultacs.setName(SAMLSSOConstants.SAMLFormFields.DEFAULT_ACS);
        defaultacs.setValue("https://www.zuora.com/apps/saml/SSO/alias/defaultAlias");
        defaultacs.setDisplayName("Default Assertion Consumer URL");

        Property nameid = new Property();
        nameid.setName(SAMLSSOConstants.SAMLFormFields.NAME_ID_FORMAT);
        nameid.setDisplayName("NameID format ");
        nameid.setType("hidden");

        Property metadata = new Property();
        metadata.setName(SAMLSSOConstants.SAMLFormFields.METADATA);
        metadata.setDisplayName("Metadata File");
        metadata.setType("hidden");

        Property certificate = new Property();
        certificate.setName(SAMLSSOConstants.SAMLFormFields.PUB_CERT);
        certificate.setDisplayName("Certificate");

        Property alias = new Property();
        alias.setName(SAMLSSOConstants.SAMLFormFields.ALIAS);
        alias.setDisplayName("Certificate Alias");
        alias.setType("hidden");

        Property signAlgo = new Property();
        signAlgo.setName(SAMLSSOConstants.SAMLFormFields.SIGN_ALGO);
        signAlgo.setDisplayName("Response Signing Algorithm ");
        signAlgo.setValue("http://www.w3.org/2000/09/xmldsig#rsa-sha1");
        signAlgo.setType("hidden");

        Property digestAlgo = new Property();
        digestAlgo.setName(SAMLSSOConstants.SAMLFormFields.DIGEST_ALGO);
        digestAlgo.setDisplayName("Response Digest Algorithm ");
        digestAlgo.setValue("http://www.w3.org/2000/09/xmldsig#sha1");
        digestAlgo.setType("hidden");

        Property enableSign = new Property();
        enableSign.setName(SAMLSSOConstants.SAMLFormFields.ENABLE_RESPONSE_SIGNING);
        enableSign.setDisplayName("Enable Response Signing");
        enableSign.setValue("false");
        enableSign.setType("hidden");

        Property enableSigValidation = new Property();
        enableSigValidation.setName(SAMLSSOConstants.SAMLFormFields.ENABLE_SIGNATURE_VALIDATION);
        enableSigValidation.setDisplayName("Enable Signature Validation in Authentication Requests and Logout " +
                "Requests");
        enableSigValidation.setValue("false");
        enableSigValidation.setType("hidden");

        Property enableAtrProf = new Property();
        enableAtrProf.setName(SAMLSSOConstants.SAMLFormFields.ENABLE_ATTR_PROF);
        enableAtrProf.setDisplayName("Enable Attribute Profile ");
        enableAtrProf.setValue("true");
        enableAtrProf.setType("hidden");

        Property enableDefaultAtrProf = new Property();
        enableDefaultAtrProf.setName(SAMLSSOConstants.SAMLFormFields.ENABLE_DEFAULT_ATTR_PROF);
        enableDefaultAtrProf.setDisplayName("Include Attributes in the Response Always ");
        enableDefaultAtrProf.setValue("true");
        enableDefaultAtrProf.setType("hidden");

        Property enableAssertionSigned = new Property();
        enableAssertionSigned.setName(SAMLSSOConstants.SAMLFormFields.ENABLE_ASSERTION_SIGNING);
        enableAssertionSigned.setDisplayName("Enable Assertion Signing ");
        enableAssertionSigned.setValue("true");
        enableAssertionSigned.setType("hidden");

        Property enableEncAssert = new Property();
        enableEncAssert.setName(SAMLSSOConstants.SAMLFormFields.ENABLE_ASSERTION_ENCRYPTION);
        enableEncAssert.setDisplayName("Enable Assertion Encryption ");
        enableEncAssert.setValue("false");
        enableEncAssert.setType("hidden");

        Property enableAudienceRestriction = new Property();
        enableAudienceRestriction.setName(SAMLSSOConstants.SAMLFormFields.ENABLE_AUDIENCE_RESTRICTION);
        enableAudienceRestriction.setDisplayName("Enable Audience Restriction ");
        enableAudienceRestriction.setValue("false");
        enableAudienceRestriction.setType("hidden");

        Property audiences = new Property();
        audiences.setName(SAMLSSOConstants.SAMLFormFields.AUDIENCE_URLS);
        audiences.setDisplayName("Audience URLs");
        audiences.setType("hidden");

        Property enableRecipients = new Property();
        enableRecipients.setName(SAMLSSOConstants.SAMLFormFields.ENABLE_RECIPIENTS);
        enableRecipients.setDisplayName("Enable Recipient Validation ");
        enableRecipients.setValue("false");
        enableRecipients.setType("hidden");

        Property receipients = new Property();
        receipients.setName(SAMLSSOConstants.SAMLFormFields.RECEIPIENT_URLS);
        receipients.setDisplayName("Recipient URLs");
        receipients.setType("hidden");

        Property enableIDPSSO = new Property();
        enableIDPSSO.setName(SAMLSSOConstants.SAMLFormFields.ENABLE_IDP_INIT_SSO);
        enableIDPSSO.setValue("true");
        enableIDPSSO.setDisplayName("Enable IdP Initiated SSO ");
        enableIDPSSO.setType("hidden");

        Property enableIDPSLO = new Property();
        enableIDPSLO.setName(SAMLSSOConstants.SAMLFormFields.ENABLE_IDP_INIT_SLO);
        enableIDPSLO.setDisplayName("Enable IdP Initiated SLO ");
        enableIDPSLO.setType("hidden");

        Property idpSLOUrls = new Property();
        idpSLOUrls.setName(SAMLSSOConstants.SAMLFormFields.IDP_SLO_URLS);
        idpSLOUrls.setDisplayName("IDP SLO Urls");
        idpSLOUrls.setType("hidden");

        return new Property[]{issuer, appType, acsurls, defaultacs, nameid, alias, signAlgo, digestAlgo, enableSign,
                enableSigValidation, enableEncAssert, enableAtrProf, enableDefaultAtrProf, enableAudienceRestriction,
                audiences, enableRecipients, receipients, enableIDPSSO, enableIDPSLO, idpSLOUrls,
                enableAssertionSigned, certificate, metadata};
    }

    @Override
    public String getRelyingPartyKey() {
        return SAMLSSOConstants.SAMLFormFields.ISSUER;
    }
}
