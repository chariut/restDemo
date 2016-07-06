package com.demo.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
 


@SpringBootApplication 
@RestController
public class DemoHelloWorld {
	public static final String KANSAS_NOTE = "<table width='90%' align='center'>"+
                              "<tr>"+
                                "<td width='50%' align='left' valign='top'><P align='left'><span class='style20'><B>"+
                                  "<noindex><a href='http://www.netstate.com/states/symb/ks_symb.htm'>Kansas State Symbols</a></noindex>"+
                                  ":</B></span></P>"+
                                  "<BLOCKQUOTE>"+
                                    "<P align='left'> <span class='style20'><B>Capital: </B>"+
                                          "<noindex><A HREF='http://www.topeka.org/' TARGET='_blank'>Topeka</A></noindex>"+
                                          "<BR>"+
                                          "<B>Motto: </B>Ad Astra Per Aspera (To the Stars Through Difficulties)<BR>"+
                                          "<B>Kansas</B> State Seal<BR>"+
                                          "<B>Amphibian:</B>"+
                                          "<noindex><A HREF='http://www.gpnc.org/barred.htm' TARGET='_blank'>Barred"+
                                            "Tiger Salamander</A></noindex>"+
                                          "<BR>"+
                                          "<B>Animal: </B>"+
                                          "<noindex><A HREF='http://www.pbs.org/wnet/nature/buffalo/' TARGET='_blank'>American"+
                                            "Buffalo</A></noindex>"+
                                          "<BR>"+
                                          "<B>Bird: </B>"+
                                          "<noindex><A HREF='http://www.nhptv.org/natureworks/westmeadowlark.htm' TARGET='_blank'>Western"+
                                            "Meadowlark</A></noindex>"+
                                          "<BR>"+
                                          "<B>Flower: </B>"+
                                          "<noindex><A HREF='http://www.gpnc.org/sunflower.htm' TARGET='_blank'>Wild"+
                                            "Native Sunflower</A></noindex>"+
                                          "<BR>"+
                                          "<B>Insect:</B>"+
                                          "<noindex><a href='http://www.gpnc.org/honeybee.htm'>The"+
                                            "Honeybee</a></noindex>"+
                                          "<BR>"+
                                          "<B>Reptile: </B>"+
                                          "<noindex><A HREF='http://www.gpnc.org/ornate.htm' TARGET='_blank'>Ornate"+
                                            "Box Turtle</A></noindex>"+
                                          "<BR>"+
                                          "<B>Song: </B>"+
                                          "<noindex><A HREF='http://www.ku.edu/heritage/kssights/range.htm' TARGET='_blank'>Home"+
                                            "on the Range</A></noindex>"+
                                          "<BR>"+
                                          "<B>Tree: </B>"+
                                          "<noindex><A HREF='http://www.extension.iastate.edu/forestry/iowa_trees/trees/eastern_cottonwood.html' TARGET='_blank'> Cottonwood</A></noindex>"+
                                    "</span></P>"+
                                "</BLOCKQUOTE></td>"+
                                "<td width='50%' align='center' valign='top'><p><img src='images/states/maps/KansasFlag-map.jpg' width='250' height='134'><br>"+
                                  "<a href='//pinterest.com/pin/create/button/?url=http%3A%2F%2Fwww.atozkidsstuff.com%2Fkansas.html&media=http%3A%2F%2Fwww.atozkidsstuff.com%2Fimages%2Fstates%2Fmaps%2FKansasFlag-map.jpg&description=Resources%20and%20activities%20for%20school%20age%20children%20on%20the%20state%20of%20Kansas.' data-pin-do='buttonPin' data-pin-config='none'><img src='//assets.pinterest.com/images/pidgets/pin_it_button.png' border='0' /></a></p>"+
                                  "<p class='style20'><a href='colorpages/states/statesymbols/KansasStateSymbols.pdf' target='_blank'>Kansas State Symbols <br>"+
"Information Sheet <br>"+
"and Color Pages (pdf)</a></p>"+
                                  "<p><img src='images/states/maps/KansasMap_of_USA.png' width='280' height='183'></p></td>"+
                              "</tr>"+
                            "</table>";
	
	public static final String MISSOURI_NOTE = 
			"<table width='90%'>"+
					"         <tr>"+
					"            <td width='50%' align='left' valign='top'><P><span class='style20'><B>Missouri State:</B></span></P>"+
					"              <BLOCKQUOTE>"+
					"                <P> <span class='style20'><B>"+
					"                  <noindex><a href='http://www.sos.mo.gov/Kids/history/symbols.asp?symbol=frog'>Missouri State Symbols </a></noindex>"+
					"                  <br>"+
					"                 Capital: </B>"+
					"                      <noindex><A HREF='http://www.jeffcitymo.org/' TARGET='_blank'>Jefferson"+
					"                        City</A></noindex>"+
					"                      <BR>"+
					"                      <B>Motto: </B>Salus populi suprema lex esto (The welfare of the "+
					"                  people shall be the supreme law)<BR>"+
					"                                    <B>Missouri</B>"+
					"                                    <noindex><a href='http://www.sos.mo.gov/Kids/history/symbols.asp?symbol=seal'>State"+
					"                                      Seal</a></noindex>"+
					"                                    <BR>"+
					"                                    <B>Animal:</B>"+
					"                                    <noindex><a href='http://www.sos.mo.gov/Kids/history/symbols.asp?symbol=animal'>Missouri Mule</a></noindex>"+
					"                                    <br>"+
					"                                    <strong>Amphibian:</strong>"+
					"                                    <noindex><a href='http://www.sos.mo.gov/Kids/history/symbols.asp?symbol=frog'>North American Bullfrog</a></noindex>"+
					"                                    <BR>"+
					"                                    <B>Aquatic Animal: </B>"+
					"                                    <noindex><a href='http://www.sos.mo.gov/Kids/history/symbols.asp?symbol=aquatic'>Paddlefish</a></noindex>"+
					"                                    <BR>"+
					"                                    <B>Bird: </B>"+
					"                                    <noindex><a href='http://www.sos.mo.gov/Kids/history/symbols.asp?symbol=bird'>Bluebird</a></noindex>"+
					"                                    <BR>"+
					"                                    <B>Dance: </B>Square"+
					"                 Dance<BR>"+
					"                                    <B>Flower: </B>"+
					"                                    <noindex><a href='http://www.sos.mo.gov/Kids/history/symbols.asp?symbol=floral'>Hawthorn</a></noindex>"+
					"                                    <BR>"+
					"                                    <B>Fish:</B> Channel"+
					"                  Catfish<BR>"+
					"                                    <B>Fossil:</B> Crinoid<BR>"+
					"                                    <B>Horse:</B>"+
					"                                    <noindex><a href='http://www.sos.mo.gov/Kids/history/symbols.asp?symbol=horse'>Fox"+
					"                                      Trotting Horse</a></noindex>"+
					"                                    <BR>"+
					"                                    <B>Insect</B>:"+
					"                  <noindex><a href='http://www.sos.mo.gov/Kids/history/symbols.asp?symbol=insect'>Honeybee</a></noindex>"+
					"                                    <BR>"+
					"                                    <B>Mineral: </B>"+
					"                                    <noindex><a href='http://www.sos.mo.gov/Kids/history/symbols.asp?symbol=mineral'>Galena</a></noindex>"+
					"                                    <BR>"+
					"                                    <B>Musical Instrument:</B>"+
					"                                    <noindex><a href='http://www.sos.mo.gov/Kids/history/symbols.asp?symbol=fiddle'>Fiddle</a></noindex>"+
					"                                    <br>"+
					"                                    <strong>Nut</strong>:"+
					"                  <noindex><a href='http://www.sos.mo.gov/Kids/history/symbols.asp?symbol=nut'>Eastern Black Walnut </a></noindex>"+
					"                                    <br>"+
					"                                    <strong>Reptile:</strong> <a href='http://www.sos.mo.gov/Kids/history/symbols.asp?symbol=reptile'>Three-toed box turtle</a><BR>"+
					"                                    <B>Rock: </B>"+
					"                                    <noindex><a href='http://www.sos.mo.gov/Kids/history/symbols.asp?symbol=rock'>Mozarkite</a></noindex>"+
					"                                    <BR>"+
					"                                    <B>Song: </B><a href='http://www.sos.mo.gov/Kids/history/symbols.asp?symbol=song'>Missouri"+
					"                                      Waltz</a><BR>"+
					"        <B>Tree: </B>"+
					"        <noindex><a href='http://www.sos.mo.gov/Kids/history/symbols.asp?symbol=tree'>Flowering"+
					"          Dogwood</a></noindex>"+
					"        <BR>"+
					"        <B>Tree Nut:</B> Eastern"+
					"                  Black Walnut</span></P>"+
					"            </BLOCKQUOTE></td>"+
					"            <td width='50%' align='center' valign='top'><img src='images/states/maps/MissouriFlagMap.jpg' width='215' height='189'><br>"+
					"            <a href='//pinterest.com/pin/create/button/?url=http%3A%2F%2Fwww.atozkidsstuff.com%2Fmissouri.html&media=http%3A%2F%2Fwww.atozkidsstuff.com%2Fimages%2Fstates%2Fmaps%2FMissouriFlagMap.jpg&description=Resources%20and%20activities%20for%20school%20age%20children%20on%20the%20state%20of%20Missouri.' data-pin-do='buttonPin' data-pin-config='none'><img src='//assets.pinterest.com/images/pidgets/pin_it_button.png' border='0' /></a><br>"+
					"              <br>"+
					"                <a href='colorpages/states/statesymbols/MissouriStateSymbols.pdf' target='_blank' class='style20'>Missouri State Symbols <br>"+
					"Information Sheet <br>"+
					"and Color Pages (pdf)</a><br>"+
					"              <br>"+
					"            <img src='images/states/maps/MissouriMap.png' width='278' height='181'><br></td>"+
					"          </tr>"+
					"        </table>";
	
	String chariInfo;
 
	@RequestMapping("/kansas")
	public ModelAndView helloKansas() {
		
		String message = KANSAS_NOTE;
		return new ModelAndView("welcome", "message", message);
	}
	
	@RequestMapping("/missouri")
	public ModelAndView helloMO() {
		
		String message = MISSOURI_NOTE;
		return new ModelAndView("welcome", "message", message);
	}
	
	@RequestMapping("/hiChari")
	public ModelAndView helloChari() {
		
		
		return new ModelAndView("welcome", "message", "Hi from Demo Team!");
	}
	
	public static void main(String[] args) {
		SpringApplication.run(DemoHelloWorld.class, args);
	}
}
