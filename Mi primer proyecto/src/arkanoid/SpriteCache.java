/**
 * Curso B�sico de desarrollo de Juegos en Java - Invaders
 * 
 * (c) 2004 Planetalia S.L. - Todos los derechos reservados. Prohibida su reproducci�n
 * 
 * http://www.planetalia.com
 * 
 */
package arkanoid;

import java.awt.image.BufferedImage;
import java.net.URL;
import java.util.HashMap;

import javax.imageio.ImageIO;

public class SpriteCache extends ResourceCache{
	private HashMap sprites;
	
	public SpriteCache() {
		sprites = new HashMap();
	}
	
	private BufferedImage loadImage(String nombre) {
		URL url=null;
		try {
			url = getClass().getResource(nombre);
			return ImageIO.read(url);
		} catch (Exception e) {
			System.out.println("No se pudo cargar la imagen " + nombre +" de "+url);
			System.out.println("El error fue : "+e.getClass().getName()+" "+e.getMessage());
			System.exit(0);
			return null;
		}
	}
	
	public BufferedImage getSprite(String spriteName) {
		BufferedImage img = (BufferedImage)sprites.get(spriteName);
		if (img == null) {
			img = loadImage(spriteName);
			sprites.put(spriteName,img);
		}
		return img;
	}

	@Override
	protected Object loadResource(URL url) {
		return null;
	}
}
