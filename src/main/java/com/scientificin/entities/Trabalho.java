package com.scientificin.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.OneToMany;

import org.springframework.data.jpa.domain.AbstractPersistable;

@Entity
public class Trabalho extends AbstractPersistable<Long> {
	
	public enum TipoDeTrabalho {
		Artigo,
		Livro,
		ProjetoDePesquisa
	}
	
	public enum AreaDoConhecimento {
		MATEMÁTICA("Matemática"),
		PROBABILIDADE_E_ESTATÍSTICA("Probabilidade e Estatística"),
		CIÊNCIA_DA_COMPUTAÇÃO("Ciência da Computação"),
		ASTRONOMIA("Astronomia"),
		FÍSICA("Física"),
		QUÍMICA("Química"),
		GEOCIÊNCIAS("Geociências"),
		OCEANOGRAFIA("Oceanografia"),
		BIOLOGIA_GERAL("Biologia Geral"),
		GENÉTICA("Genética"),
		BOTÂNICA("Botânica"),
		ZOOLOGIA("Zoologia"),
		ECOLOGIA("Ecologia"),
		MORFOLOGIA("Morfologia"),
		FISIOLOGIA("Fisiologia"),
		BIOQUÍMICA("Bioquímica"),
		BIOFÍSICA("Biofísica"),
		FARMACOLOGIA("Farmacologia"),
		IMUNOLOGIA("Imunologia"),
		MICROBIOLOGIA("Microbiologia"),
		PARASITOLOGIA("Parasitologia"),
		ENGENHARIA_CIVIL("Engenharia Civil"),
		ENGENHARIA_DE_MINAS("Engenharia de Minas"),
		ENGENHARIA_DE_MATERIAIS_E_METALÚRGICA("Engenharia de Materiais e Metalúrgica"),
		ENGENHARIA_ELÉTRICA("Engenharia Elétrica"),
		ENGENHARIA_MECÂNICA("Engenharia Mecânica"),
		ENGENHARIA_QUÍMICA("Engenharia Química"),
		ENGENHARIA_SANITÁRIA("Engenharia Sanitária"),
		ENGENHARIA_DE_PRODUÇÃO("Engenharia de Produção"),
		ENGENHARIA_NUCLEAR("Engenharia Nuclear"),
		ENGENHARIA_DE_TRANSPORTES("Engenharia de Transportes"),
		ENGENHARIA_NAVAL_E_OCEÂNICA("Engenharia Naval e Oceânica"),
		ENGENHARIA_AEROESPACIAL("Engenharia Aeroespacial"),
		ENGENHARIA_BIOMÉDICA("Engenharia Biomédica"),
		MEDICINA("Medicina"),
		ODONTOLOGIA("Odontologia"),
		FARMÁCIA("Farmácia"),
		ENFERMAGEM("Enfermagem"),
		NUTRIÇÃO("Nutrição"),
		SAÚDE_COLETIVA("Saúde Coletiva"),
		FONOAUDIOLOGIA("Fonoaudiologia"),
		FISIOTERAPIA_E_TERAPIA_OCUPACIONAL("Fisioterapia e Terapia Ocupacional"),
		EDUCAÇÃO_FÍSICA("Educação Física"),
		AGRONOMIA("Agronomia"),
		RECURSOS_FLORESTAIS_E_ENGENHARIA_FLORESTAL("Recursos Florestais e Engenharia Florestal"),
		ENGENHARIA_AGRÍCOLA("Engenharia Agrícola"),
		ZOOTECNIA("Zootecnia"),
		MEDICINA_VETERINÁRIA("Medicina Veterinária"),
		RECURSOS_PESQUEIROS_E_ENGENHARIA_DE_PESCA("Recursos Pesqueiros e Engenharia de Pesca"),
		CIÊNCIA_E_TECNOLOGIA_DE_ALIMENTOS("Ciência e Tecnologia de Alimentos"),
		DIREITO("Direito"),
		ADMINISTRAÇÃO("Administração"),
		ECONOMIA("Economia"),
		ARQUITETURA_E_URBANISMO("Arquitetura e Urbanismo"),
		PLANEJAMENTO_URBANO_E_REGIONAL("Planejamento Urbano e Regional"),
		DEMOGRAFIA("Demografia"),
		CIÊNCIA_DA_INFORMAÇÃO("Ciência da Informação"),
		MUSEOLOGIA("Museologia"),
		COMUNICAÇÃO("Comunicação"),
		SERVIÇO_SOCIAL("Serviço Social"),
		ECONOMIA_DOMÉSTICA("Economia Doméstica"),
		DESENHO_INDUSTRIAL("Desenho Industrial"),
		TURISMO("Turismo"),
		FILOSOFIA("Filosofia"),
		SOCIOLOGIA("Sociologia"),
		SOCIOLOGIA_DO_DESENVOLVIMENTO("Sociologia do Desenvolvimento"),
		ANTROPOLOGIA("Antropologia"),
		ARQUEOLOGIA("Arqueologia"),
		HISTÓRIA("História"),
		GEOGRAFIA("Geografia"),
		PSICOLOGIA("Psicologia"),
		EDUCAÇÃO("Educação"),
		CIÊNCIA_POLÍTICA("Ciência Política"),
		TEOLOGIA("Teologia"),
		LINGÜÍSTICA("Lingüística"),
		LETRAS("Letras"),
		ARTES("Artes");
		
		private String name;

		AreaDoConhecimento(String nome) {
			this.name = name;
		}

		public String getName() {
			return name;
		}
	}
	
	public enum SubAreaDoConhecimento {

		ÁLGEBRA("Álgebra"),
		ANÁLISE("Análise"),
		GEOMETRIA_E_TOPOLOGIA("Geometria e Topologia"),
		MATEMÁTICA_APLICADA("Matemática Aplicada"),
		PROBABILIDADE("Probabilidade"),
		ESTATÍSTICA("Estatística"),
		PROBABILIDADE_E_ESTATÍSTICA_APLICADAS("Probabilidade e Estatística Aplicadas"),
		TEORIA_DA_COMPUTAÇÃO("Teoria da Computação"),
		MATEMÁTICA_DA_COMPUTAÇÃO("Matemática da Computação"),
		METODOLOGIA_E_TÉCNICAS_DA_COMPUTAÇÃO("Metodologia e Técnicas da Computação"),
		SISTEMAS_DE_COMPUTAÇÃO("Sistemas de Computação"),
		ASTRONOMIA_DE_POSIÇÃO_E_MECÂNICA_CELESTE("Astronomia de Posição e Mecânica Celeste"),
		ASTROFÍSICA_ESTELAR("Astrofísica Estelar"),
		ASTROFÍSICA_DO_MEIO_INTERESTELAR("Astrofísica do Meio Interestelar"),
		ASTROFÍSICA_EXTRAGALÁCTICA("Astrofísica Extragaláctica"),
		ASTRONOMIA_DO_SISTEMA_SOLAR("Astronomia do Sistema Solar"),
		INSTRUMENTAÇÃO_ASTRONÔMICA("Instrumentação Astronômica"),
		FÍSICA_GERAL("Física Geral"),
		ÁREAS_CLÁSSICAS_DE_FENOMENOLOGIA_E_SUAS_APLICAÇÕES("Áreas Clássicas de Fenomenologia e suas Aplicações"),
		FÍSICA_DAS_PARTÍCULAS_ELEMENTARES_E_CAMPOS("Física das Partículas Elementares e Campos"),
		FÍSICA_NUCLEAR("Física Nuclear"),
		FÍSICA_ATÔMICA_E_MOLECULAR("Física Atômica e Molecular"),
		FÍSICA_DOS_FLUÍDOS_FÍSICA_DE_PLASMAS_E_DESCARGAS_ELÉTRICAS("Física dos Fluídos, Física de Plasmas e Descargas Elétricas"),
		FÍSICA_DA_MATÉRIA_CONDENSADA("Física da Matéria Condensada"),
		QUÍMICA_ORGÂNICA("Química Orgânica"),
		QUÍMICA_INORGÂNICA("Química Inorgânica"),
		FÍSICO_QUÍMICA("Físico-química"),
		QUÍMICA_ANALÍTICA("Química Analítica"),
		GEOLOGIA("Geologia"),
		GEOFÍSICA("Geofísica"),
		METEOROLOGIA("Meteorologia"),
		GEODÉSIA("Geodésia"),
		GEOGRAFIA_FÍSICA("Geografia Física"),
		OCEANOGRAFIA_BIOLÓGICA("Oceanografia Biológica"),
		OCEANOGRAFIA_FÍSICA("Oceanografia Física"),
		OCEANOGRAFIA_QUÍMICA("Oceanografia Química"),
		OCEANOGRAFIA_GEOLÓGICA("Oceanografia Geológica"),
		GENÉTICA_QUANTITATIVA("Genética Quantitativa"),
		GENÉTICA_MOLECULAR_E_DE_MICROORGANISMOS("Genética Molecular e de Microorganismos"),
		GENÉTICA_VEGETAL("Genética Vegetal"),
		GENÉTICA_ANIMAL("Genética Animal"),
		GENÉTICA_HUMANA_E_MÉDICA("Genética Humana e Médica"),
		MUTAGÊNESE("Mutagênese"),
		PALEOBOTÂNICA("Paleobotânica"),
		MORFOLOGIA_VEGETAL("Morfologia Vegetal"),
		FISIOLOGIA_VEGETAL("Fisiologia Vegetal"),
		TAXONOMIA_VEGETAL("Taxonomia Vegetal"),
		FITOGEOGRAFIA("Fitogeografia"),
		BOTÂNICA_APLICADA("Botânica Aplicada"),
		PALEOZOOLOGIA("Paleozoologia"),
		MORFOLOGIA_DOS_GRUPOS_RECENTES("Morfologia dos Grupos Recentes"),
		FISIOLOGIA_DOS_GRUPOS_RECENTES("Fisiologia dos Grupos Recentes"),
		COMPORTAMENTO_ANIMAL("Comportamento Animal"),
		TAXONOMIA_DOS_GRUPOS_RECENTES("Taxonomia dos Grupos Recentes"),
		ZOOLOGIA_APLICADA("Zoologia Aplicada"),
		ECOLOGIA_TEÓRICA("Ecologia Teórica"),
		ECOLOGIA_DE_ECOSSITEMAS("Ecologia de Ecossitemas"),
		ECOLOGIA_APLICADA("Ecologia Aplicada"),
		CITOLOGIA_E_BIOLOGIA_CELULAR("Citologia e Biologia Celular"),
		EMBRIOLOGIA("Embriologia"),
		HISTOLOGIA("Histologia"),
		ANATOMIA("Anatomia"),
		FISIOLOGIA_GERAL("Fisiologia Geral"),
		FISIOLOGIA_DE_ÓRGÃOS_E_SISTEMAS("Fisiologia de Órgãos e Sistemas"),
		FISIOLOGIA_DO_ESFORÇO("Fisiologia do Esforço"),
		FISIOLOGIA_COMPARADA("Fisiologia Comparada"),
		QUÍMICA_DE_MACROMOLÉCULAS("Química de Macromoléculas"),
		BIOQUÍMICA_DE_MICROORGANISMOS("Bioquímica de Microorganismos"),
		METABOLISMO_E_BIOENERGÉTICA("Metabolismo e Bioenergética"),
		BIOLOGIA_MOLECULAR("Biologia Molecular"),
		ENZIMOLOGIA("Enzimologia"),
		BIOFÍSICA_MOLECULAR("Biofísica Molecular"),
		BIOFÍSICA_CELULAR("Biofísica Celular"),
		BIOFÍSICA_DE_PROCESSOS_E_SISTEMAS("Biofísica de Processos e Sistemas"),
		RADIOLOGIA_E_FOTOBIOLOGIA("Radiologia e Fotobiologia"),
		FARMACOLOGIA_GERAL("Farmacologia Geral"),
		FARMACOLOGIA_AUTONÔMICA("Farmacologia Autonômica"),
		NEUROPSICOFARMACOLOGIA("Neuropsicofarmacologia"),
		FARMACOLOGIA_CARDIORENAL("Farmacologia Cardiorenal"),
		FARMACOLOGIA_BIOQUÍMICA_E_MOLECULAR("Farmacologia Bioquímica e Molecular"),
		ETNOFARMACOLOGIA("Etnofarmacologia"),
		TOXICOLOGIA("Toxicologia"),
		FARMACOLOGIA_CLÍNICA("Farmacologia Clínica"),
		IMUNOQUÍMICA("Imunoquímica"),
		IMUNOLOGIA_CELULAR("Imunologia Celular"),
		IMUNOGENÉTICA("Imunogenética"),
		IMUNOLOGIA_APLICADA("Imunologia Aplicada"),
		BIOLOGIA_E_FISIOLOGIA_DOS_MICROORGANISMOS("Biologia e Fisiologia dos Microorganismos"),
		MICROBIOLOGIA_APLICADA("Microbiologia Aplicada"),
		PROTOZOOLOGIA_DE_PARASITOS("Protozoologia de Parasitos"),
		HELMINTOLOGIA_DE_PARASITOS("Helmintologia de Parasitos"),
		ENTOMOLOGIA_E_MALACOLOGIA_DE_PARASITOS_E_VETORES("Entomologia e Malacologia de Parasitos e Vetores"),
		CONSTRUÇÃO_CIVIL("Construção Civil"),
		ESTRUTURAS("Estruturas"),
		GEOTÉCNICA("Geotécnica"),
		ENGENHARIA_HIDRÁULICA("Engenharia Hidráulica"),
		INFRA_ESTRUTURA_DE_TRANSPORTES("Infra-estrutura de Transportes"),
		PESQUISA_MINERAL("Pesquisa Mineral"),
		LAVRA("Lavra"),
		TRATAMENTO_DE_MINÉRIOS("Tratamento de Minérios"),
		INSTALAÇÕES_E_EQUIPAMENTOS_METALÚRGICOS("Instalações e Equipamentos Metalúrgicos"),
		METALURGIA_EXTRATIVA("Metalurgia Extrativa"),
		METALURGIA_DE_TRANSFORMAÇÃO("Metalurgia de Transformação"),
		METALURGIA_FÍSICA("Metalurgia Física"),
		MATERIAIS_NÃO_METÁLICOS("Materiais Não-metálicos"),
		MATERIAIS_ELÉTRICOS("Materiais Elétricos"),
		MEDIDAS_ELÉTRICAS_MAGNÉTICAS_E_ELETRÔNICAS_INSTRUMENTAÇÃO("Medidas Elétricas, Magnéticas e Eletrônicas, Instrumentação"),
		CIRCUITOS_ELÉTRICOS_MAGNÉTICOS_E_ELETRÔNICOS("Circuitos Elétricos, Magnéticos e Eletrônicos"),
		SISTEMAS_ELÉTRICOS_DE_POTÊNCIA("Sistemas Elétricos de Potência"),
		ELETRÔNICA_INDUSTRIAL_SISTEMAS_E_CONTROLES_ELETRÔNICOS("Eletrônica Industrial, Sistemas e Controles Eletrônicos"),
		TELECOMUNICAÇÕES("Telecomunicações"),
		FENÔMENOS_DE_TRANSPORTES("Fenômenos de Transportes"),
		ENGENHARIA_TÉRMICA("Engenharia Térmica"),
		MECÂNICA_DOS_SÓLIDOS("Mecânica dos Sólidos"),
		PROJETOS_DE_MÁQUINAS("Projetos de Máquinas"),
		PROCESSOS_DE_FABRICAÇÃO("Processos de Fabricação"),
		PROCESSOS_INDUSTRIAIS_DE_ENGENHARIA_QUÍMICA("Processos Industriais de Engenharia Química"),
		OPERAÇÕES_INDUSTRIAIS_E_EQUIPAMENTOS_PARA_ENGENHARIA_QUÍMICA("Operações Industriais e Equipamentos para Engenharia Química"),
		TECNOLOGIA_QUÍMICA("Tecnologia Química"),
		RECURSOS_HÍDRICOS("Recursos Hídricos"),
		TRATAMENTOS_DE_ÁGUAS_DE_ABASTECIMENTO_E_RESIDUÁRIAS("Tratamentos de Águas de Abastecimento e Residuárias"),
		SANEAMENTO_BÁSICO("Saneamento Básico"),
		SANEAMENTO_AMBIENTAL("Saneamento Ambiental"),
		GERÊNCIA_DE_PRODUÇÃO("Gerência de Produção"),
		PESQUISA_OPERACIONAL("Pesquisa Operacional"),
		ENGENHARIA_DO_PRODUTO("Engenharia do Produto"),
		ENGENHARIA_ECONÔMICA("Engenharia Econômica"),
		APLICAÇÕES_DE_RADIOISÓTOPOS("Aplicações de Radioisótopos"),
		FUSÃO_CONTROLADA("Fusão Controlada"),
		COMBUSTÍVEL_NUCLEAR("Combustível Nuclear"),
		TECNOLOGIA_DOS_REATORES("Tecnologia dos Reatores"),
		PLANEJAMENTO_DE_TRANSPORTES("Planejamento de Transportes"),
		VEÍCULOS_E_EQUIPAMENTOS_DE_CONTROLE("Veículos e Equipamentos de Controle"),
		OPERAÇÕES_DE_TRANSPORTES("Operações de Transportes"),
		HIDRODINÂMICA_DE_NAVIOS_E_SISTEMAS_OCEÂNICOS("Hidrodinâmica de Navios e Sistemas Oceânicos"),
		ESTRUTURAS_NAVAIS_E_OCEÂNICAS("Estruturas Navais e Oceânicas"),
		MÁQUINAS_MARÍTIMAS("Máquinas Marítimas"),
		PROJETO_DE_NAVIOS_E_DE_SISTEMAS_OCEÂNICOS("Projeto de Navios e de Sistemas Oceânicos"),
		TECNOLOGIA_DE_CONSTRUÇÃO_NAVAL_E_DE_SISTEMAS_OCEANICOS("Tecnologia de Construção Naval e de Sistemas Ocenicos"),
		AERODINÂMICA("Aerodinâmica"),
		DINÂMICA_DE_VÔO("Dinâmica de Vôo"),
		ESTRUTURAS_AEROESPACIAIS("Estruturas Aeroespaciais"),
		MATERIAIS_E_PROCESSOS_PARA_ENGENHARIA_AERONÁUTICA_AEROESPACIAL("Materiais e Processos para Engenharia Aeronáutica, Aeroespacial"),
		PROPULSÃO_AEROESPACIAL("Propulsão Aeroespacial"),
		SISTEMAS_AEROESPACIAIS("Sistemas Aeroespaciais"),
		BIOENGENHARIA("Bioengenharia"),
		ENGENHARIA_MÉDICA("Engenharia Médica"),
		CLÍNICA_MÉDICA("Clínica Médica"),
		CIRURGIA("Cirurgia"),
		SAÚDE_MATERNO_INFANTIL("Saúde Materno-infantil"),
		PSIQUIATRIA("Psiquiatria"),
		ANATOMIA_PATOLÓGICA_E_PATOLOGIA_CLÍNICA("Anatomia Patológica e Patologia Clínica"),
		RADIOLOGIA_MÉDICA("Radiologia Médica"),
		MEDICINA_LEGAL_E_DEONTOLOGIA("Medicina Legal e Deontologia"),
		CLÍNICA_ODONTOLÓGICA("Clínica Odontológica"),
		CIRURGIA_BUCO_MAXILO_FACIAL("Cirurgia Buco-maxilo-facial"),
		ORTODONTIA("Ortodontia"),
		ODONTOPEDIATRIA("Odontopediatria"),
		PERIODONTIA("Periodontia"),
		ENDODONTIA("Endodontia"),
		RADIOLOGIA_ODONTOLÓGICA("Radiologia Odontológica"),
		ODONTOLOGIA_SOCIAL_E_PREVENTIVA("Odontologia Social e Preventiva"),
		MATERIAIS_ODONTOLÓGICOS("Materiais Odontológicos"),
		FARMACOTECNIA("Farmacotecnia"),
		FARMACOGNOSIA("Farmacognosia"),
		ANÁLISE_TOXICOLÓGICA("Análise Toxicológica"),
		ANÁLISE_E_CONTROLE_DE_MEDICAMENTOS("Análise e Controle de Medicamentos"),
		BROMATOLOGIA("Bromatologia"),
		ENFERMAGEM_MÉDICO_CIRÚRGICA("Enfermagem Médico-cirúrgica"),
		ENFERMAGEM_OBSTÉTRICA("Enfermagem Obstétrica"),
		ENFERMAGEM_PEDIÁTRICA("Enfermagem Pediátrica"),
		ENFERMAGEM_PSIQUIÁTRICA("Enfermagem Psiquiátrica"),
		ENFERMAGEM_DE_DOENÇAS_CONTAGIOSAS("Enfermagem de Doenças Contagiosas"),
		ENFERMAGEM_DE_SAÚDE_PÚBLICA("Enfermagem de Saúde Pública"),
		BIOQUÍMICA_DA_NUTRIÇÃO("Bioquímica da Nutrição"),
		DIETÉTICA("Dietética"),
		ANÁLISE_NUTRICIONAL_DE_POPULAÇÃO("Análise Nutricional de População"),
		DESNUTRIÇÃO_E_DESENVOLVIMENTO_FISIOLÓGICO("Desnutrição e Desenvolvimento Fisiológico"),
		EPIDEMIOLOGIA("Epidemiologia"),
		SAÚDE_PÚBLICA("Saúde Pública"),
		MEDICINA_PREVENTIVA("Medicina Preventiva"),
		CIÊNCIA_DO_SOLO("Ciência do Solo"),
		FITOSSANIDADE("Fitossanidade"),
		FITOTECNIA("Fitotecnia"),
		FLORICULTURA_PARQUES_E_JARDINS("Floricultura, Parques e Jardins"),
		AGROMETEOROLOGIA("Agrometeorologia"),
		EXTENSÃO_RURAL("Extensão Rural"),
		SILVICULTURA("Silvicultura"),
		MANEJO_FLORESTAL("Manejo Florestal"),
		TÉCNICAS_E_OPERAÇÕES_FLORESTAIS("Técnicas e Operações Florestais"),
		TECNOLOGIA_E_UTILIZAÇÃO_DE_PRODUTOS_FLORESTAIS("Tecnologia e Utilização de Produtos Florestais"),
		CONSERVAÇÃO_DA_NATUREZA("Conservação da Natureza"),
		ENERGIA_DE_BIOMASSA_FLORESTAL("Energia de Biomassa Florestal"),
		MÁQUINAS_E_IMPLEMENTOS_AGRÍCOLAS("Máquinas e Implementos Agrícolas"),
		ENGENHARIA_DE_ÁGUA_E_SOLO("Engenharia de Água e Solo"),
		ENGENHARIA_DE_PROCESSAMENTO_DE_PRODUTOS_AGRÍCOLAS("Engenharia de Processamento de Produtos Agrícolas"),
		CONSTRUÇÕES_RURAIS_E_AMBIÊNCIA("Construções Rurais e Ambiência"),
		ENERGIZAÇÃO_RURAL("Energização Rural"),
		ECOLOGIA_DOS_ANIMAIS_DOMÉSTICOS_E_ETOLOGIA("Ecologia dos Animais Domésticos e Etologia"),
		GENÉTICA_E_MELHORAMENTO_DOS_ANIMAIS_DOMÉSTICOS("Genética e Melhoramento dos Animais Domésticos"),
		NUTRIÇÃO_E_ALIMENTAÇÃO_ANIMAL("Nutrição e Alimentação Animal"),
		PASTAGENS_E_FORRAGICULTURA("Pastagens e Forragicultura"),
		PRODUÇÃO_ANIMAL("Produção Animal"),
		CLÍNICA_E_CIRURGIA_ANIMAL("Clínica e Cirurgia Animal"),
		MEDICINA_VETERINÁRIA_PREVENTIVA("Medicina Veterinária Preventiva"),
		PATOLOGIA_ANIMAL("Patologia Animal"),
		REPRODUÇÃO_ANIMAL("Reprodução Animal"),
		INSPEÇÃO_DE_PRODUTOS_DE_ORIGEM_ANIMAL("Inspeção de Produtos de Origem Animal"),
		RECURSOS_PESQUEIROS_MARINHOS("Recursos Pesqueiros Marinhos"),
		RECURSOS_PESQUEIROS_DE_ÁGUAS_INTERIORES("Recursos Pesqueiros de Águas Interiores"),
		AQUICULTURA("Aquicultura"),
		ENGENHARIA_DE_PESCA("Engenharia de Pesca"),
		CIÊNCIA_DE_ALIMENTOS("Ciência de Alimentos"),
		TECNOLOGIA_DE_ALIMENTOS("Tecnologia de Alimentos"),
		ENGENHARIA_DE_ALIMENTOS("Engenharia de Alimentos"),
		TEORIA_DO_DIREITO("Teoria do Direito"),
		DIREITO_PÚBLICO("Direito Público"),
		DIREITO_PRIVADO("Direito Privado"),
		DIREITOS_ESPECIAIS("Direitos Especiais"),
		ADMINISTRAÇÃO_DE_EMPRESAS("Administração de Empresas"),
		ADMINISTRAÇÃO_PÚBLICA("Administração Pública"),
		ADMINISTRAÇÃO_DE_SETORES_ESPECÍFICOS("Administração de Setores Específicos"),
		CIÊNCIAS_CONTÁBEIS("Ciências Contábeis"),
		TEORIA_ECONÔMICA("Teoria Econômica"),
		MÉTODOS_QUANTITATIVOS_EM_ECONOMIA("Métodos Quantitativos em Economia"),
		ECONOMIA_MONETÁRIA_E_FISCAL("Economia Monetária e Fiscal"),
		CRESCIMENTO_FLUTUAÇÕES_E_PLANEJAMENTO_ECONÔMICO("Crescimento, Flutuações e Planejamento Econômico"),
		ECONOMIA_INTERNACIONAL("Economia Internacional"),
		ECONOMIA_DOS_RECURSOS_HUMANOS("Economia dos Recursos Humanos"),
		ECONOMIA_INDUSTRIAL("Economia Industrial"),
		ECONOMIA_DO_BEM_ESTAR_SOCIAL("Economia do Bem-estar Social"),
		ECONOMIA_REGIONAL_E_URBANA("Economia Regional e Urbana"),
		ECONOMIAS_AGRÁRIA_E_DOS_RECURSOS_NATURAIS("Economias Agrária e dos Recursos Naturais"),
		FUNDAMENTOS_DE_ARQUITETURA_E_URBANISMO("Fundamentos de Arquitetura e Urbanismo"),
		PROJETO_DE_ARQUITETURA_E_URBANISMO("Projeto de Arquitetura e Urbanismo"),
		TECNOLOGIA_DE_ARQUITETURA_E_URBANISMO("Tecnologia de Arquitetura e Urbanismo"),
		PAISAGISMO("Paisagismo"),
		FUNDAMENTOS_DO_PLANEJAMENTO_URBANO_E_REGIONAL("Fundamentos do Planejamento Urbano e Regional"),
		MÉTODOS_E_TÉCNICAS_DO_PLANEJAMENTO_URBANO_E_REGIONAL("Métodos e Técnicas do Planejamento Urbano e Regional"),
		SERVIÇOS_URBANOS_E_REGIONAIS("Serviços Urbanos e Regionais"),
		DISTRIBUIÇÃO_ESPACIAL("Distribuição Espacial"),
		TENDÊNCIA_POPULACIONAL("Tendência Populacional"),
		COMPONENTES_DA_DINÂMICA_DEMOGRÁFICA("Componentes da Dinâmica Demográfica"),
		NUPCIALIDADE_E_FAMÍLIA("Nupcialidade e Família"),
		DEMOGRAFIA_HISTÓRICA("Demografia Histórica"),
		POLÍTICA_PÚBLICA_E_POPULAÇÃO("Política Pública e População"),
		FONTES_DE_DADOS_DEMOGRÁFICOS("Fontes de Dados Demográficos"),
		TEORIA_DA_INFORMAÇÃO("Teoria da Informação"),
		BIBLIOTECONOMIA("Biblioteconomia"),
		ARQUIVOLOGIA("Arquivologia"),
		TEORIA_DA_COMUNICAÇÃO("Teoria da Comunicação"),
		JORNALISMO_E_EDITORAÇÃO("Jornalismo e Editoração"),
		RÁDIO_E_TELEVISÃO("Rádio e Televisão"),
		RELAÇÕES_PÚBLICAS_E_PROPAGANDA("Relações Públicas e Propaganda"),
		COMUNICAÇÃO_VISUAL("Comunicação Visual"),
		FUNDAMENTOS_DO_SERVIÇO_SOCIAL("Fundamentos do Serviço Social"),
		SERVIÇO_SOCIAL_APLICADO("Serviço Social Aplicado"),
		PROGRAMAÇÃO_VISUAL("Programação Visual"),
		DESENHO_DE_PRODUTO("Desenho de Produto"),
		HISTÓRIA_DA_FILOSOFIA("História da Filosofia"),
		METAFÍSICA("Metafísica"),
		LÓGICA("Lógica"),
		ÉTICA("Ética"),
		EPISTEMOLOGIA("Epistemologia"),
		FILOSOFIA_BRASILEIRA("Filosofia Brasileira"),
		FUNDAMENTOS_DA_SOCIOLOGIA("Fundamentos da Sociologia"),
		SOCIOLOGIA_DO_CONHECIMENTO("Sociologia do Conhecimento"),
		SOCIOLOGIA_URBANA("Sociologia Urbana"),
		SOCIOLOGIA_RURAL("Sociologia Rural"),
		SOCIOLOGIA_DA_SAÚDE("Sociologia da Saúde"),
		OUTRAS_SOCIOLOGIAS_ESPECÍFICAS("Outras Sociologias Específicas"),
		TEORIA_ANTROPOLÓGICA("Teoria Antropológica"),
		ETNOLOGIA_INDÍGENA("Etnologia Indígena"),
		ANTROPOLOGIA_URBANA("Antropologia Urbana"),
		ANTROPOLOGIA_RURAL("Antropologia Rural"),
		ANTROPOLOGIA_DAS_POPULAÇÕES_AFRO_BRASILEIRAS("Antropologia das Populações Afro-brasileiras"),
		TEORIA_E_MÉTODO_EM_ARQUEOLOGIA("Teoria e Método em Arqueologia"),
		ARQUEOLOGIA_PRÉ_HISTÓRICA("Arqueologia Pré-histórica"),
		ARQUEOLOGIA_HISTÓRICA("Arqueologia Histórica"),
		TEORIA_E_FILOSOFIA_DA_HISTÓRIA("Teoria e Filosofia da História"),
		HISTÓRIA_ANTIGA_E_MEDIEVAL("História Antiga e Medieval"),
		HISTÓRIA_MODERNA_E_CONTEMPORÂNEA("História Moderna e Contemporânea"),
		HISTÓRIA_DA_AMÉRICA("História da América"),
		HISTÓRIA_DO_BRASIL("História do Brasil"),
		HISTÓRIA_DAS_CIÊNCIAS("História das Ciências"),
		GEOGRAFIA_HUMANA("Geografia Humana"),
		GEOGRAFIA_REGIONAL("Geografia Regional"),
		FUNDAMENTOS_E_MEDIDAS_DA_PSICOLOGIA("Fundamentos e Medidas da Psicologia"),
		PSICOLOGIA_EXPERIMENTAL("Psicologia Experimental"),
		PSICOLOGIA_FISIOLÓGICA("Psicologia Fisiológica"),
		PSICOLOGIA_COMPARATIVA("Psicologia Comparativa"),
		PSICOLOGIA_SOCIAL("Psicologia Social"),
		PSICOLOGIA_COGNITIVA("Psicologia Cognitiva"),
		PSICOLOGIA_DO_DESENVOLVIMENTO_HUMANO("Psicologia do Desenvolvimento Humano"),
		PSICOLOGIA_DO_ENSINO_E_DA_APRENDIZAGEM("Psicologia do Ensino e da Aprendizagem"),
		PSICOLOGIA_DO_TRABALHO_E_ORGANIZACIONAL("Psicologia do Trabalho e Organizacional"),
		TRATAMENTO_E_PREVENÇÃO_PSICOLÓGICA("Tratamento e Prevenção Psicológica"),
		FUNDAMENTOS_DA_EDUCAÇÃO("Fundamentos da Educação"),
		ADMINISTRAÇÃO_EDUCACIONAL("Administração Educacional"),
		PLANEJAMENTO_E_AVALIAÇÃO_EDUCACIONAL("Planejamento e Avaliação Educacional"),
		ENSINO_APRENDIZAGEM("Ensino-aprendizagem"),
		CURRÍCULO("Currículo"),
		ORIENTAÇÃO_E_ACONSELHAMENTO("Orientação e Aconselhamento"),
		TÓPICOS_ESPECÍFICOS_DE_EDUCAÇÃO("Tópicos Específicos de Educação"),
		TEORIA_POLÍTICA("Teoria Política"),
		ESTADO_E_GOVERNO("Estado e Governo"),
		COMPORTAMENTO_POLÍTICO("Comportamento Político"),
		POLÍTICAS_PÚBLICAS("Políticas Públicas"),
		POLÍTICA_INTERNACIONAL("Política Internacional"),
		HISTÓRIA_DA_TEOLOGIA("História da Teologia"),
		TEOLOGIA_MORAL("Teologia Moral"),
		TEOLOGIA_SISTEMÁTICA("Teologia Sistemática"),
		TEOLOGIA_PASTORAL("Teologia Pastoral"),
		TEORIA_E_ANÁLISE_LINGÜÍSTICA("Teoria e Análise Lingüística"),
		FILOSOFIA_DA_LINGUAGEM("Filosofia da Linguagem"),
		LINGÜÍSTICA_HISTÓRICA("Lingüística Histórica"),
		SOCIOLINGÜÍSTICA_E_DIALETOLOGIA("Sociolingüística e Dialetologia"),
		PSICOLINGÜÍSTICA("Psicolingüística"),
		LINGÜÍSTICA_APLICADA("Lingüística Aplicada"),
		LÍNGUA_PORTUGUESA("Língua Portuguesa"),
		LÍNGUAS_ESTRANGEIRAS_MODERNAS("Línguas Estrangeiras Modernas"),
		LÍNGUAS_CLÁSSICAS("Línguas Clássicas"),
		LÍNGUAS_INDÍGENAS("Línguas Indígenas"),
		TEORIA_LITERÁRIA("Teoria Literária"),
		LITERATURA_BRASILEIRA("Literatura Brasileira"),
		OUTRAS_LITERATURAS_VERNÁCULAS("Outras Literaturas Vernáculas"),
		LITERATURAS_ESTRANGEIRAS_MODERNAS("Literaturas Estrangeiras Modernas"),
		LITERATURAS_CLÁSSICAS("Literaturas Clássicas"),
		LITERATURA_COMPARADA("Literatura Comparada"),
		FUNDAMENTOS_E_CRÍTICA_DAS_ARTES("Fundamentos e Crítica das Artes"),
		ARTES_PLÁSTICAS("Artes Plásticas"),
		MÚSICA("Música"),
		DANÇA("Dança"),
		TEATRO("Teatro"),
		ÓPERA("Ópera"),
		FOTOGRAFIA("Fotografia"),
		CINEMA("Cinema"),
		ARTES_DO_VÍDEO("Artes do Vídeo"),
		EDUCAÇÃO_ARTÍSTICA("Educação Artística");

		private String name;

		private SubAreaDoConhecimento(String nome) {
			this.name = name;
		}


public String getName() {
	return name;
}

	}

	private static final long serialVersionUID = 8901353480917316536L;

	@Column(length = 512)
	String notasDoAutor;
	@Column(length = 256)
	String titulo;
	@Column
	String texto;
	@Column
	Integer posicao;

	@Column
    @Enumerated(EnumType.STRING)
	TipoDeTrabalho tipoDeTrabalho;
	@Column
	Integer posicaoNaArea;
	@Column
	Integer posicaoNaSubArea;

	@OneToMany
	List<Avaliacao> avaliacoes;
	@OneToMany
	List<Recurso> recursos;
	@OneToMany
	List<Bibliografia> bibliografias;

	@Enumerated
	AreaDoConhecimento area;
	@Enumerated
	SubAreaDoConhecimento subArea;

	public String getNotasDoAutor() {
		return notasDoAutor;
	}

	public void setNotasDoAutor(String notasDoAutor) {
		this.notasDoAutor = notasDoAutor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public Integer getPosicao() {
		return posicao;
	}

	public void setPosicao(Integer posicao) {
		this.posicao = posicao;
	}

	public Integer getPosicaoNaArea() {
		return posicaoNaArea;
	}

	public void setPosicaoNaArea(Integer posicaoNaArea) {
		this.posicaoNaArea = posicaoNaArea;
	}

	public Integer getPosicaoNaSubArea() {
		return posicaoNaSubArea;
	}

	public void setPosicaoNaSubArea(Integer posicaoNaSubArea) {
		this.posicaoNaSubArea = posicaoNaSubArea;
	}

	public List<Avaliacao> getAvaliacoes() {
		return avaliacoes;
	}

	public void setAvaliacoes(List<Avaliacao> avaliacoes) {
		this.avaliacoes = avaliacoes;
	}

	public List<Recurso> getRecursos() {
		return recursos;
	}

	public void setRecursos(List<Recurso> recursos) {
		this.recursos = recursos;
	}

	public List<Bibliografia> getBibliografias() {
		return bibliografias;
	}

	public void setBibliografias(List<Bibliografia> bibliografias) {
		this.bibliografias = bibliografias;
	}

	public AreaDoConhecimento getArea() {
		return area;
	}

	public void setArea(AreaDoConhecimento area) {
		this.area = area;
	}

	public SubAreaDoConhecimento getSubArea() {
		return subArea;
	}

	public void setSubArea(SubAreaDoConhecimento subArea) {
		this.subArea = subArea;
	}

}
