# searches response bodies for any json like objects containing boolean values
# this helps in situations where match and replace rules can get you access to client-side features
# make access controls testing much nicer

var jreg = Pattern.compile("\\{[^{}]*\"[^\"]*\"\\s*:\\s*(true|false|0|1)[^{}]*\\}");
if (requestResponse.hasResponse() && requestResponse.response().contains(jreg))
{
	return true;
}
return ""; 
