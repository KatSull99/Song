import java.util.ArrayList;


public class Playlist
{
static ArrayList<Song>playlist=new ArrayList<Song>();
	public static void main (String[] args)
	{
				fillArray();
				printList();
				cut10();
				printList();
				longestTitle();
				printList();
				becomeAStar();
				printList();
						
	}
			public static void fillArray()
			{
				playlist.add(new Song("Firework ", " Katy Perry ", 340));
				playlist.add(new Song("Somewhere Over The Rainbow ", " Israel Kamakawiwoole ", 350));
				playlist.add(new Song("Eye of the Tiger ", " Survivor ", 410));
				playlist.add(new Song("Hello ", " Adele ", 600));
				playlist.add(new Song("Icarus ", " Bastille ", 250));
			
			}
		
			public static void printList()
			{
					for(int i=0; i<playlist.size(); i++)
						{
						System.out.println(playlist.get(i).getTitle() + playlist.get(i).getArtist() + playlist.get(i).getSeconds());
						}
					System.out.println();
			}
				
			public static void cut10()
			{
				
				for(int i=0; i<playlist.size(); i++)
					{
					playlist.get(i).setSeconds(playlist.get(i).getSeconds()-10);
					
					}
				}
	
			public static void longestTitle()
			{
				int longestTitle=playlist.get(0).getTitle().length();
				for(int i=0; i<playlist.size(); i++)
					{
					if (playlist.get(i).getTitle().length()>longestTitle)
						{
						longestTitle=playlist.get(i).getTitle().length();	
						}
					}
				for(int i=0; i<playlist.size(); i++)
					{
					if (playlist.get(i).getTitle().length()==longestTitle)
						{
						playlist.remove(i);
						
						}
					}
			}
			
			public static void becomeAStar()
			{
				playlist.get(0).setArtist("Kathleen Sullivan ");
				
				System.out.println();
			}
				
				}
				
			
		
