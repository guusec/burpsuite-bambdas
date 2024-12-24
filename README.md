## feature flags bambda
creates a column that shows whether json blobs containing boolean values are found in the response body. this can help identify client-side controls that you can make match and replace rules for.
```java
var jreg = Pattern.compile("\\{[^{}]*\"[^\"]*\"\\s*:\\s*(true|false|0|1)[^{}]*\\}");
if (requestResponse.hasResponse() && requestResponse.response().contains(jreg))
{
	return true;
}
return "";
```

## sec-fetch-mode bambda
highlights all requests with the Sec-Fetch-Mode header when the value is navigate. this helps identify top-level navigations and can make CSPT testing easier.
```java
var mimeType = requestResponse.mimeType();
if (requestResponse.contains("Sec-Fetch-Mode: navigate", false))
{    requestResponse.annotations().setHighlightColor(HighlightColor.PINK);
}
return mimeType != MimeType.CSS
 && mimeType != MimeType.IMAGE_UNKNOWN
 && mimeType != MimeType.IMAGE_JPEG
 && mimeType != MimeType.IMAGE_GIF
 && mimeType != MimeType.IMAGE_PNG
 && mimeType != MimeType.IMAGE_BMP
 && mimeType != MimeType.IMAGE_TIFF
 && mimeType != MimeType.UNRECOGNIZED
 && mimeType != MimeType.SOUND
 && mimeType != MimeType.VIDEO
 && mimeType != MimeType.FONT_WOFF
 && mimeType != MimeType.FONT_WOFF2
 && mimeType != MimeType.APPLICATION_UNKNOWN;
```
