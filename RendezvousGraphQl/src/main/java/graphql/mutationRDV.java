package graphql;

import java.util.List;

import com.coxautodev.graphql.tools.GraphQLRootResolver;

import entite.Logement;
import entite.RendezVous;
import repository.LogementRepository;
import repository.RendezVousRepository;

public class mutationRDV implements GraphQLRootResolver{

	private final RendezVousRepository rdvRepos;
	private final LogementRepository logementRepos;
	public mutationRDV(RendezVousRepository rdvRepository,LogementRepository logementRepos) 
	{
		this.rdvRepos=rdvRepository;
		this.logementRepos=logementRepos;
	}	
	public List<Logement> saveLogement(int reference,String adresse,String delegation) {
		logementRepos.saveLogement(new Logement(reference,adresse,delegation));	
		return logementRepos.getAllLogements();
		
	}
	
/*	public boolean addRendezVous(RendezVous rendezVous) {
		return rdvRepos.addRendezVous(rendezVous);
	}
	
	public boolean updateRendezVous(RendezVous rendezVous) {
		return rdvRepos.updateRendezVous(rendezVous);
	}
	
      public boolean deleteRendezVous(int id) {
		
		return rdvRepos.deleteRendezVous(id);
		
	}*/
	
	
	
}
