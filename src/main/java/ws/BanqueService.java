package ws;

import java.time.LocalDate;
import java.util.List;
@WebService(serviceName = "Banque")
public class BanqueService {
    public double conversion(double mt){
        return mt*11;
    }
    public Compte getCompte(int code) {
        return new Compte(code, Math.random()*50000, LocalDate.now());
    }

    public List<Compte> getComptes() {
        return List.of(
                new Compte(1, Math.random()*50000, LocalDate.now()),
                new Compte(2, Math.random()*50000, LocalDate.now()),
                new Compte(3, Math.random()*50000, LocalDate.now())
        );
    }

}
