package ch.makery.Project_1;

public class Analysis {
String name;
String contents;
String p_word; //parola piu' frequente
int frequence; //frequenza p_word (quante volte compare in media secondo me)
float min,max,average,trend;   //poi se mancano dei dati li metteremo

Analysis(String realName){
	name = realName;
    contents = null;
	p_word = null; //parola piu' frequente
	frequence = 0; //frequenza p_word (quante volte compare in media secondo me)
	min = 0;
	max= 0;
	average= 0;
	trend= 0;
}
void SetContents(){};
void SetP_word(){};
/*
 * continuiamo magari anche con i get?? 
 */


}