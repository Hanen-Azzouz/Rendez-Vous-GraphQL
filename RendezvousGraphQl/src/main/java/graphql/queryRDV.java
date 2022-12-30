package graphql;

import java.util.List;

import com.coxautodev.graphql.tools.GraphQLRootResolver;

import entite.Logement;
import entite.RendezVous;
import entite.Logement.Type;
import repository.LogementRepository;
import repository.RendezVousRepository;

public class queryRDV implements GraphQLRootResolver{
	
	private final RendezVousRepository rdvRepos;
	
	private final LogementRepository logementRepos;
	public queryRDV(RendezVousRepository rdvRepository,LogementRepository logementRepos) {
		this.rdvRepos=rdvRepository;
		this.logementRepos=logementRepos;
	}
	
	public List<Logement> findAllLogements(){
		return logementRepos.getAllLogements();
	}

	public List<Logement> findLogementsByType(Type type){
		return logementRepos.getLogementsByType(type);
		
		
	}

	

	public Logement getLogementsByReference(int reference) {
		
		
		return logementRepos.getLogementsByReference(reference);
	}

	
	public List<RendezVous> getListeRendezVous(){
		return rdvRepos.getListeRendezVous();
	}
	
	
	public List<RendezVous> getListeRendezVousByLogementRef(int reference){
		return rdvRepos.getListeRendezVousByLogementRef(reference);
	}
	
	
	
	public Logement getLogementByRDV(int idRDV) {
		
		return rdvRepos.getLogementByRDV(idRDV);
		
	}
	
	
	

}
