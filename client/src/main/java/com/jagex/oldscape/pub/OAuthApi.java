package com.jagex.oldscape.pub;

public interface OAuthApi {
	boolean isOnLoginScreen();

	long getAccountHash();

	void setClient(int var1);

	void setOtlTokenRequester(OtlTokenRequester var1);

	void setRefreshTokenRequester(RefreshAccessTokenRequester var1);
}
