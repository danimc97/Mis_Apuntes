/**
 * Curso B�sico de desarrollo de Juegos en Java - Invaders
 * 
 * (c) 2004 Planetalia S.L. - Todos los derechos reservados. Prohibida su reproducci�n
 * 
 * http://www.planetalia.com
 * 
 */

package arkanoid;

import java.net.URL;
import java.util.HashMap;

public abstract class ResourceCache {
	protected HashMap resources;
	
	public ResourceCache() {
	  resources = new HashMap();
	}
	
	protected Object loadResource(String name) {
		URL url=null;
		url = getClass().getResource(name);
		return loadResource(url);
	}
	
	protected Object getResource(String name) {
		Object res = resources.get(name);
		if (res == null) {
			res = loadResource(name);
			resources.put(name,res);
		}
		return res;
	}
	
	protected abstract Object loadResource(URL url);

}
