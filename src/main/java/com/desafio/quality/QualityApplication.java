package com.desafio.quality;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.desafio.quality.enuns.TipoDocumentoEnum;
import com.desafio.quality.model.Banco;
import com.desafio.quality.model.Cidade;
import com.desafio.quality.model.Titulo;
import com.desafio.quality.model.Usuario;
import com.desafio.quality.repository.BancoRepository;
import com.desafio.quality.repository.CidadeRepository;
import com.desafio.quality.repository.TituloRepository;
import com.desafio.quality.repository.UsuarioRepository;

@SpringBootApplication
public class QualityApplication {

	public static void main(String[] args) {
		SpringApplication.run(QualityApplication.class, args);
	}

	  @Bean
	  @Transactional
	  public CommandLineRunner demo(UsuarioRepository repository, CidadeRepository cidadeRepository, BancoRepository bancoRepository, TituloRepository tituloRepository) {
		    
		  List<Cidade> cidades = new ArrayList<>();
		  cidades.add(new Cidade( 11,	"Rondônia",	"RO"));
		  cidades.add(new Cidade( 12,	"Acre",	"AC"));
		  cidades.add(new Cidade( 13,	"Amazonas",	"AM"));
		  cidades.add(new Cidade( 14,	"Roraima",	"RR"));
		  cidades.add(new Cidade( 15,	"Pará",	"PA"));
		  cidades.add(new Cidade( 16,	"Amapá",	"AP"));
		  cidades.add(new Cidade( 17,	"Tocantins",	"TO"));
		  cidades.add(new Cidade( 21,	"Maranhão",	"MA"));
		  cidades.add(new Cidade( 22,	"Piauí",	"PI"));
		  cidades.add(new Cidade( 23,	"Ceará",	"CE"));
		  cidades.add(new Cidade( 24,	"Rio Grande do Norte",	"RN"));
		  cidades.add(new Cidade( 25,	"Paraíba",	"PB"));
		  cidades.add(new Cidade( 26,	"Pernambuco",	"PE"));
		  cidades.add(new Cidade( 27,	"Alagoas",	"AL"));
		  cidades.add(new Cidade( 28,	"Sergipe",	"SE"));
		  cidades.add(new Cidade( 29,	"Bahia",	"BA"));
		  cidades.add(new Cidade( 31,	"Minas Gerais",	"MG"));
		  cidades.add(new Cidade( 32,	"Espírito Santo",	"ES"));
		  cidades.add(new Cidade( 33,	"Rio de Janeiro",	"RJ"));
		  cidades.add(new Cidade( 35,	"São Paulo",	"SP"));
		  cidades.add(new Cidade( 41,	"Paraná",	"PR"));
		  cidades.add(new Cidade( 42,	"Santa Catarina",	"SC"));
		  cidades.add(new Cidade( 43,	"Rio Grande do Sul", 	"RS"));
		  cidades.add(new Cidade( 50,	"Mato Grosso do Sul",	"MS"));
		  cidades.add(new Cidade( 51,	"Mato Grosso",	"MT"));
		  cidades.add(new Cidade( 52,	"Goiás",	"GO"));
		  cidades.add(new Cidade( 53,	"Distrito Federal",	"DF"));
		  
		  cidadeRepository.saveAll(cidades);
		  
		  List<Usuario> usaurios = new ArrayList<>();
		  usaurios.add(new Usuario("Joao", "68543399017", TipoDocumentoEnum.get("68543399017"), 12345, new Date(), null));
		  usaurios.add(new Usuario("Pedro", "19772014076", TipoDocumentoEnum.get("19772014076"), 12345, new Date(), null));
		  usaurios.add(new Usuario("Rui", "59000939054", TipoDocumentoEnum.get("59000939054"), 12345, new Date(), null));
		  repository.saveAll(usaurios);

		  List<Banco> bancos = new ArrayList<>();
		  
		  bancos.add(new Banco(null, "Brasil","BB", 1));
		  bancos.add(new Banco(null, "Caixa", "CX", 53));
		  bancos.add(new Banco(null, "Intermerdium", "Inter", 253));
		  bancoRepository.saveAll(bancos);
	
		  Usuario pedro = repository.buscaPorNome("Pedro");
		  
		  Usuario joao = repository.buscaPorNome("Joao");
		  
		  Usuario rui = repository.buscaPorNome("Rui");
		  Banco inter =  bancoRepository.buscaPorNome("Intermerdium");
		  
		  List<Titulo> titulos = new ArrayList<>();
		  
		  titulos.add(new Titulo(pedro, new Date(),  new BigDecimal("102"), 10, Boolean.FALSE, "", new Date(), inter));
		  titulos.add(new Titulo(joao, new Date(),  new BigDecimal("145"), 10, Boolean.FALSE, "", new Date(), inter));
		  titulos.add(new Titulo(rui, new Date(),  new BigDecimal("166"), 10, Boolean.FALSE, "", new Date(), inter));
		  tituloRepository.saveAll(titulos);
		 
		  inter.setTitulo(titulos);
		  bancoRepository.save(inter);
		 
		  Banco inter2 =  bancoRepository.buscaPorNome("Intermerdium");
		return null;
	}
	  
	  @Bean
		public WebMvcConfigurer corsConfigurer() {
			return new WebMvcConfigurer() {
				@Override
				public void addCorsMappings(CorsRegistry registry) {
					registry.addMapping("/greeting-javaconfig").allowedOrigins("http://localhost:3000");
				}
			};
		}
}
