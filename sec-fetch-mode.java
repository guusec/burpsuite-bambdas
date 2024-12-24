# this highlights requests with Sec-Fetch-Mode headers when the value is navigate
# helps organize the flow of top-level navigations and stuff
# makes cspt testing easier

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
