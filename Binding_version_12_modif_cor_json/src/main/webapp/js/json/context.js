/**
 * 
 */

const PORT 		= location.port
const PROTOCOL 	= location.protocol
const HOSTNAME 	= location.hostname
const ORIGINE   = location.origin
const JSONFILE_TEST = 'json/exemple.json'

function getContext(obj){
	//console.log("URL ="+ORIGINE+obj+"/")
	return ORIGINE+obj+"/"
}