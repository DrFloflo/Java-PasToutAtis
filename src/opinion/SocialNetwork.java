package opinion;

import java.util.LinkedList;

import exceptions.BadEntryException;
import exceptions.ItemBookAlreadyExistsException;
import exceptions.ItemFilmAlreadyExistsException;
import exceptions.MemberAlreadyExistsException;
import exceptions.NotItemException;
import exceptions.NotMemberException;

/**
 * Skeleton for the SocialNetwork
 * 
 */
public class SocialNetwork implements ISocialNetwork {
	private int nbMembers;

	@Override
	public int nbMembers() {
		// TODO Auto-generated method stub
		return this.nbMembers;
	}

	@Override
	public int nbFilms() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int nbBooks() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void addMember(String login, String password, String profile)
			throws BadEntryException, MemberAlreadyExistsException {
		/*if(login==null || login.replaceAll(" ", "").length()==0) { throw new BadEntryException("Erreur le login est null");}
		if(password==null || password.replaceAll(" ", "").length()==0) { throw new BadEntryException("Erreur le password est null");}
		if(password!=null && password.replaceAll(" ", "").length()<4) { throw new BadEntryException("Erreur le password est compose de moins de 4 char");}
		if(profile==null || profile.replaceAll(" ", "").length()==0) { throw new BadEntryException("Erreur le profile est null");}
		this.nbMembers+=1;*/




		// TODO Auto-generated method stub
	}

	@Override
	public void addItemFilm(String login, String password, String title,
			String kind, String director, String scriptwriter, int duration)
			throws BadEntryException, NotMemberException,
			ItemFilmAlreadyExistsException {
		/*if(login==null || login.replaceAll(" ", "").length()==0) { throw new BadEntryException("Erreur le login est null");}
		if(password==null || password.replaceAll(" ", "").length()==0) { throw new BadEntryException("Erreur le password est null");}
		if(password!=null && password.replaceAll(" ", "").length()<4) { throw new BadEntryException("Erreur le password est compose de moins de 4 char");}
		if(title==null || title.replaceAll(" ", "").length()==0) { throw new BadEntryException("Erreur le profile est null");}*/


		// TODO Auto-generated method stub

	}

	@Override
	public void addItemBook(String login, String password, String title,
			String kind, String author, int nbPages) throws BadEntryException,
			NotMemberException, ItemBookAlreadyExistsException {
		// TODO Auto-generated method stub

	}

	@Override
	public float reviewItemFilm(String login, String password, String title,
			float mark, String comment) throws BadEntryException,
			NotMemberException, NotItemException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float reviewItemBook(String login, String password, String title,
			float mark, String comment) throws BadEntryException,
			NotMemberException, NotItemException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public LinkedList<String> consultItems(String title)
			throws BadEntryException {
		return new LinkedList<String>();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
