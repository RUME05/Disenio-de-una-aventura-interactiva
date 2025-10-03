
package com.example.tarea2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import com.example.tarea2.R

class AnimalActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        ThemeManager.applyTheme(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animal)

        val habitatType = intent.getStringExtra("HABITAT_TYPE")
        val animalTitle: TextView = findViewById(R.id.animal_title)
        val animalImage1: ImageView = findViewById(R.id.animal_image_1)
        val animalName1: TextView = findViewById(R.id.animal_name_1)
        val animalImage2: ImageView = findViewById(R.id.animal_image_2)
        val animalName2: TextView = findViewById(R.id.animal_name_2)
        val animalImage3: ImageView = findViewById(R.id.animal_image_3)
        val animalName3: TextView = findViewById(R.id.animal_name_3)
        val animalImage4: ImageView = findViewById(R.id.animal_image_4)
        val animalName4: TextView = findViewById(R.id.animal_name_4)
        val animalImage5: ImageView = findViewById(R.id.animal_image_5)
        val animalName5: TextView = findViewById(R.id.animal_name_5)

        animalTitle.text = "Animales de: $habitatType"

// En AnimalActivity.kt, dentro de onCreate
        when (habitatType) {
            "Bosques" -> {
                animalImage1.setImageResource(R.drawable.ic_bear)
                animalName1.text = "Oso Pardo"
                animalImage1.setOnClickListener {
                    showInfoDialog(
                        "Oso Pardo (Ursus arctos)",
                        "Es la especie de oso más extendida en el mundo y uno de los mayores carnívoros terrestres del planeta. Se encuentra en América del Norte, Europa y Asia, y es conocido por su adaptabilidad a una amplia variedad de hábitats, desde bosques hasta tundra. ."
                    )
                }
                animalImage2.setImageResource(R.drawable.ic_deer)
                animalName2.text = "Ciervo"
                animalImage2.setOnClickListener {
                    showInfoDialog("Ciervo (Cervidae)", "Es un mamífero rumiante, herbívoro y de la familia de los cérvidos. Se caracteriza por la gran cornamenta ramificada de los machos, la cual se renueva anualmente. Estos animales sociales habitan en una variedad de entornos, desde bosques hasta praderas, y tienen un agudo sentido del olfato y el oído.")
                }
                animalImage3.setImageResource(R.drawable.ic_wolf)
                animalName3.text = "Lobo Gris"
                animalImage3.setOnClickListener {
                    showInfoDialog(
                        "Lobo Gris (Canis Lupus)",
                        "Es un mamífero carnívoro y un depredador alfa que vive y caza en manada. Su dieta se basa principalmente en grandes ungulados como alces, ciervos y bisontes, aunque también consume presas más pequeñas. Posee una de las mordidas más fuertes entre los cánidos. Habita en diversos entornos del hemisferio norte, incluyendo tundra, bosques y praderas. "
                    )
                }
                animalImage4.setImageResource(R.drawable.ic_fox)
                animalName4.text = "Zorro Rojo"
                animalImage4.setOnClickListener {
                    showInfoDialog("Zorro Rojo (Vulpes Vulpes)", "Es un mamífero omnívoro y el cánido salvaje más distribuido del mundo. Se alimenta de pequeños mamíferos, aves, frutas y carroña, y puede adaptarse tanto a entornos rurales como urbanos. Es conocido por su larga y espesa cola con la punta blanca, sus orejas puntiagudas y su pelaje rojizo. A pesar de su nombre, su pelaje puede variar en color.")
                }

                animalImage5.setImageResource(R.drawable.ic_owl)
                animalName5.text = "Buho"
                animalImage5.setOnClickListener {
                    showInfoDialog("Buho (Strigiformes)", "Es un ave rapaz, principalmente nocturna, con una visión binocular excelente y oídos sensibles y asimétricos que le permiten detectar a sus presas en la oscuridad. Existen más de 250 especies que habitan en casi todos los entornos del planeta, desde bosques hasta desiertos. Se alimenta de roedores, insectos, peces y otras aves, y algunas especies tienen un característico rostro en forma de corazón.")
                }
            }

            "Selvas" -> {
                animalImage1.setImageResource(R.drawable.ic_monkey)
                animalName1.text = "Mono Araña"
                animalImage1.setOnClickListener {
                    showInfoDialog(
                        "Mono Araña (Ateles)",
                        "Primate platirrino conocido por sus largas extremidades y su cola prensil, adaptado a la vida en las copas de los árboles."
                    )
                }

                animalImage2.setImageResource(R.drawable.ic_jaguar)
                animalName2.text = "Jaguar"
                animalImage2.setOnClickListener {
                    showInfoDialog(
                        "Jaguar (Panthera onca)",
                        "Es el felino más grande de América y el tercero del mundo. Se caracteriza por sus rosetas (manchas con un punto central), su complexión robusta y su mandíbula excepcionalmente fuerte."
                    )
                }

                animalImage3.setImageResource(R.drawable.ic_toucan)
                animalName3.text = "Tucan"
                animalImage3.setOnClickListener {
                    showInfoDialog(
                        "Tucan (Ramphastidae)",
                        "Es un ave tropical famosa por su gran pico colorido y distintivo. Su pico es sorprendentemente ligero y puede ser tan largo como su cuerpo."
                    )
                }

                animalImage4.setImageResource(R.drawable.ic_redeyedfrog)
                animalName4.text = "Rana de Ojos Rojos"
                animalImage4.setOnClickListener {
                    showInfoDialog(
                        "Rana de Ojos Rojos (Agalychnis callidryas)",
                        "Es una rana arborícola de llamativos colores, con un cuerpo verde brillante, costados azules, blancos o amarillos, y ojos rojos intensos."
                    )
                }

                animalImage5.setImageResource(R.drawable.ic_lazy)
                animalName5.text = "Perezoso"
                animalImage5.setOnClickListener {
                    showInfoDialog(
                        "Perezoso (Folivora)",
                        "Es un mamífero arbóreo de metabolismo extremadamente bajo, lo que explica sus movimientos muy lentos. No es ni un mono ni un oso, sino que pertenece a un grupo distinto de mamíferos americanos."
                    )
                }
            }

            "Desiertos" ->{
                animalImage1.setImageResource(R.drawable.ic_dromedary)
                animalName1.text = "Dromedario"
                animalImage1.setOnClickListener {
                    showInfoDialog(
                        "Dromedario (Camelus dromedarius)",
                        "Es un mamífero herbívoro de una sola joroba, originario de Arabia y que habita en desiertos y zonas áridas de África y Asia occidental. En su joroba, almacena grasa, no agua, que le sirve como reserva de energía."
                    )
                }

                animalImage2.setImageResource(R.drawable.ic_suricata)
                animalName2.text = "Suricata"
                animalImage2.setOnClickListener {
                    showInfoDialog(
                        "Suricata (Suricata suricatta)",
                        "Es un mamífero carnívoro de la familia de las mangostas, que vive en el suroeste de África. Son animales sociales de hábitos diurnos que excavan complejas redes subterráneas donde se refugian del calor y de los depredadores. Para detectar amenazas, a menudo se yerguen sobre sus patas traseras, usando su cola como apoyo."
                    )
                }

                animalImage3.setImageResource(R.drawable.ic_snake)
                animalName3.text = "Serpiente de cascabel"
                animalImage3.setOnClickListener {
                    showInfoDialog(
                        "Serpiente de cascabel (Crotalus)",
                        "Es una víbora venenosa que habita exclusivamente en el continente americano, desde Canadá hasta Argentina, con la mayor diversidad en México. Es conocida por su característico apéndice en la cola, el cascabel, que hace sonar cuando se siente amenazada."
                    )
                }

                animalImage4.setImageResource(R.drawable.ic_coyote)
                animalName4.text = "Coyote"
                animalImage4.setOnClickListener {
                    showInfoDialog(
                        "Coyote (Canis latrans)",
                        "Es un cánido salvaje de menor tamaño y complexión más ligera que el lobo. Se encuentra en Norte y Centroamérica, adaptándose a diversos hábitats, incluyendo zonas suburbanas y urbanas. Es un depredador nocturno, aunque puede cazar de día, y su dieta consiste principalmente en pequeños animales."
                    )
                }

                animalImage5.setImageResource(R.drawable.ic_scorpion)
                animalName5.text = "Escorpion"
                animalImage5.setOnClickListener {
                    showInfoDialog(
                        "Escorpion (Scorpiones)",
                        "Es un arácnido con una larga cola segmentada que termina en un aguijón venenoso. Utiliza su veneno para inmovilizar a sus presas, generalmente insectos, a las que digiere disolviendo sus tejidos con jugos digestivos. Tienen un ciclo de vida largo y una notable resistencia, pudiendo sobrevivir largos periodos de tiempo sin alimento o bajo el agua."
                    )
                }

            }

            "Praderas" -> {
                animalImage1.setImageResource(R.drawable.ic_americanbison)
                animalName1.text = "Bisonte Americano"
                animalImage1.setOnClickListener {
                    showInfoDialog(
                        "Bisonte Americano (Bison bison)",
                        "Es el mamífero terrestre más grande de América del Norte. Conocido también como búfalo americano, este herbívoro habita en las praderas y llanuras, donde se alimenta principalmente de pastos y juncos. Se caracteriza por su gran tamaño, una joroba muscular en la espalda y su pelaje espeso."
                    )
                }

                animalImage2.setImageResource(R.drawable.ic_prairiedog)
                animalName2.text = "Perro de pradera"
                animalImage2.setOnClickListener {
                    showInfoDialog(
                        "Perro de pradera (Cynomys)",
                        "Es un roedor social que vive en grandes colonias subterráneas llamadas \"ciudades\" o \"pueblos\" en las praderas del centro y oeste de Norteamérica. Existen varias especies, algunas de ellas en peligro de extinción. Son conocidos como \"ingenieros de la pradera\" por su papel en la oxigenación y fertilización del suelo, y por crear refugios para otras especies. Se alimentan de vegetación."
                    )
                }

                animalImage3.setImageResource(R.drawable.ic_wildhorse)
                animalName3.text = "Caballo salvaje"
                animalImage3.setOnClickListener {
                    showInfoDialog(
                        "Caballo salvaje (Equus ferus)",
                        "Conocidos como mustangs, son descendientes de caballos domesticados que llegaron con los exploradores españoles en el siglo XVI. Estos animales herbívoros se alimentan de la hierba de las praderas. A diferencia de los caballos domésticos, tienen una vida más corta y menos atención humana."
                    )
                }

                animalImage4.setImageResource(R.drawable.ic_baldeagle)
                animalName4.text = "Aguila calva"
                animalImage4.setOnClickListener {
                    showInfoDialog(
                        "Aguila calva (Haliaeetus leucocephalus",
                        "Es un ave rapaz y el emblema nacional de Estados Unidos. A pesar de su nombre, su cabeza está cubierta de plumas blancas que contrastan con su cuerpo y alas de color chocolate. Habita cerca de cuerpos de agua como ríos, donde se alimenta principalmente de peces."
                    )
                }

                animalImage5.visibility = View.GONE
                animalName5.visibility = View.GONE
            }

            "Sabanas" ->{
                animalImage1.setImageResource(R.drawable.ic_lion)
                animalName1.text = "Leon"
                animalImage1.setOnClickListener {
                    showInfoDialog(
                        "Leon (Panthera leo)",
                        "Es un mamífero carnívoro, el segundo felino más grande del mundo después del tigre. El macho se caracteriza por su distintiva melena, mientras que la hembra es más pequeña."
                    )
                }

                animalImage2.setImageResource(R.drawable.ic_elephant)
                animalName2.text = "Elefante"
                animalImage2.setOnClickListener {
                    showInfoDialog(
                        "Elefante (Mammuthus primigenius)",
                        "Se alimenta de hojas, ramitas y plantas acuáticas de los bosques de coníferas."
                    )
                }

                animalImage3.setImageResource(R.drawable.ic_giraffe)
                animalName3.text = "Jirafa"
                animalImage3.setOnClickListener {
                    showInfoDialog(
                        "Jirafa (Giraffa camelopardalis)",
                        "Es el mamífero más alto del mundo. Puede medir hasta 5.5 metros de altura. El patrón de manchas de su pelaje es único para cada individuo, similar a una huella dactilar."
                    )
                }

                animalImage4.setImageResource(R.drawable.ic_zebra)
                animalName4.text = "Cebra"
                animalImage4.setOnClickListener {
                    showInfoDialog(
                        "Cebra (Equus)",
                        "Son mamíferos equinos de llamativas rayas blancas y negras. Existen tres especies principales: cebra de llanura, cebra de Grevy y cebra de montaña. Ninguna cebra tiene el mismo patrón de rayas, lo que las hace únicas."
                    )
                }

                animalImage5.setImageResource(R.drawable.ic_hyena)
                animalName5.text = "Hiena"
                animalImage5.setOnClickListener {
                    showInfoDialog(
                        "Hiena (Hyaenidae)",
                        "Son mamíferos carnívoros con cuatro especies actuales, siendo la más conocida la hiena manchada. Contrario a la creencia popular, son excelentes cazadoras, además de carroñeras."
                    )
                }
            }

            "Mares" -> {
                animalImage1.setImageResource(R.drawable.ic_dolphin)
                animalName1.text = "Delfín"
                animalImage1.setOnClickListener {
                    showInfoDialog(
                        "Delfín (Delphinidae)",
                        "Mamíferos acuáticos conocidos por su gran inteligencia, agilidad y comportamiento social complejo."
                    )
                }

                animalImage2.setImageResource(R.drawable.ic_seal)
                animalName2.text = "Foca"
                animalImage2.setOnClickListener {
                    showInfoDialog(
                        "Foca (Phocidae)",
                        "Es un mamífero marino con una capa de grasa aislante y un cuerpo aerodinámico adaptado para la vida acuática. Se alimenta de peces, crustáceos y otros mariscos. La mayoría de las especies son sociables y viven principalmente en regiones polares, aunque se encuentran en otras partes del mundo."
                    )
                }

                animalImage3.setImageResource(R.drawable.ic_whale)
                animalName3.text = "Ballena"
                animalImage3.setOnClickListener {
                    showInfoDialog(
                        "Ballena (Balaenidae)",
                        "Son los mamíferos más grandes del mundo, con la ballena azul siendo la de mayor tamaño. Evolucionaron de mamíferos terrestres hace unos 50 millones de años. Existen muchas especies que se alimentan de una gran variedad de presas, desde diminutos krill hasta otros grandes mamíferos."
                    )
                }

                animalImage4.setImageResource(R.drawable.ic_seastar)
                animalName4.text = "Estrella de mar"
                animalImage4.setOnClickListener {
                    showInfoDialog(
                        "Estrella de mar (Asteroidea)",
                        "Son equinodermos que habitan en todos los océanos. Generalmente, tienen cinco brazos y se alimentan de almejas, conchas y mejillones. Su modo de alimentación es peculiar: sacan su estómago por la boca para digerir la comida. Algunas especies, como la corona de espinas, se alimentan de corales y pueden ser venenosas."
                    )
                }

                animalImage5.setImageResource(R.drawable.ic_jellyfish)
                animalName5.text = "Medusa"
                animalImage5.setOnClickListener {
                    showInfoDialog(
                        "Medusa (Medusozoa)",
                        "Son animales marinos gelatinosos, sin cerebro ni sistema nervioso central, que se componen principalmente de agua (hasta un 95%). Se desplazan mediante propulsión a chorro. Utilizan sus tentáculos, equipados con células urticantes (cnidocitos), para atrapar a sus presas. "
                    )
                }
            }

            "Océanos" ->{
                animalImage1.setImageResource(R.drawable.ic_whiteshark)
                animalName1.text = "Tiburon blanco"
                animalImage1.setOnClickListener {
                    showInfoDialog(
                        "Tiburon blanco (Carcharodon carcharias)",
                        "Es una especie de pez cartilaginoso y el pez depredador más grande del océano. Se encuentra en aguas cálidas y templadas de casi todos los océanos. Es conocido por su gran tamaño, su fuerte mordida y sus habilidades de caza, incluyendo su capacidad de saltar fuera del agua."
                    )
                }

                animalImage2.setImageResource(R.drawable.ic_clownfish)
                animalName2.text = "Pez payaso"
                animalImage2.setOnClickListener {
                    showInfoDialog(
                        "Pez payaso (Amphiprion ocellaris)",
                        "Es un pez de agua salada de colores brillantes que habita en arrecifes de coral en el Indo-Pacífico. Se protege de los depredadores. Es famoso por su capacidad de cambiar de sexo, ya que nace como macho y puede volverse hembra."
                    )
                }

                animalImage3.setImageResource(R.drawable.ic_octopus)
                animalName3.text = "Pulpo"
                animalImage3.setOnClickListener {
                    showInfoDialog(
                        "Pulpo (Octopus vulgaris)",
                        "Es un molusco cefalópodo con un cuerpo blando, ocho brazos y un pico córneo. Es uno de los invertebrados más inteligentes y puede resolver problemas complejos. Vive en todos los océanos del mundo y es capaz de camuflarse, usar herramientas y escapar de depredadores. Tiene tres corazones y sangre azul."
                    )
                }

                animalImage4.setImageResource(R.drawable.ic_shrimp)
                animalName4.text = "Camaron"
                animalImage4.setOnClickListener {
                    showInfoDialog(
                        "Camaron (Palaemon serratus)",
                        "Es un crustáceo decápodo, se encuentra en casi todos los océanos del mundo. Posee un cuerpo alargado y un exoesqueleto, que muda para crecer. Vive en arrecifes, zonas rocosas y otros hábitats marinos y se alimenta de algas y pequeños invertebrados."
                    )
                }

                animalImage5.visibility = View.GONE
                animalName5.visibility = View.GONE
            }

            "Ríos" ->{
                animalImage1.setImageResource(R.drawable.ic_riverotter)
                animalName1.text = "Nutria e rio"
                animalImage1.setOnClickListener {
                    showInfoDialog(
                        "Nutria de rio (Lontra longicaudis)",
                        "Es un mamífero semiacuático que habita en sistemas de agua dulce como ríos, arroyos y lagunas. Son excelentes nadadoras con una gran capacidad pulmonar que les permite permanecer sumergidas varios minutos. Su dieta se basa en peces, crustáceos y otros invertebrados."
                    )
                }

                animalImage2.setImageResource(R.drawable.ic_salmon)
                animalName2.text = "Salmon"
                animalImage2.setOnClickListener {
                    showInfoDialog(
                        "Salmon (Salmo salar)",
                        "Es un pez diádromo, lo que significa que migra entre agua dulce y salada para completar su ciclo de vida. Nacen en ríos, migran al océano y regresan a desovar al mismo río donde nacieron, a menudo recorriendo miles de kilómetros."
                    )
                }

                animalImage3.setImageResource(R.drawable.ic_cocodrile)
                animalName3.text = "Cocodrilo de rio"
                animalImage3.setOnClickListener {
                    showInfoDialog(
                        "Cocodrilo de rio (Crocodylus acutus)",
                        "Son reptiles de gran tamaño que habitan en climas tropicales cálidos y húmedos, con la nariz y los ojos situados en la parte superior de la cabeza para cazar mientras se mantiene sumergido.  "
                    )
                }

                animalImage4.setImageResource(R.drawable.ic_piranha)
                animalName4.text = "Piraña"
                animalImage4.setOnClickListener {
                    showInfoDialog(
                        "Piraña (Pygocentrus nattereri)",
                        "Son peces de agua dulce conocidos por sus afilados dientes y que habitan principalmente en el río Amazonas y otros ríos de Sudamérica. Prefieren aguas tranquilas o estancadas. Aunque a veces se les atribuye una ferocidad desmedida, existen diversas especies y su alimentación incluye tanto peces y carroña como semillas y frutos. "
                    )
                }

                animalImage5.visibility = View.GONE
                animalName5.visibility = View.GONE

            }

            "Lagos" ->{
                animalImage1.setImageResource(R.drawable.ic_trout)
                animalName1.text = "Trucha"
                animalImage1.setOnClickListener {
                    showInfoDialog(
                        "Trucha (Salmo trutta)",
                        "Es un pez perteneciente a la familia de los salmónidos. Son apreciadas por su carne y se pescan con fines deportivos."
                    )
                }

                animalImage2.setImageResource(R.drawable.ic_duck)
                animalName2.text = "Pato"
                animalImage2.setOnClickListener {
                    showInfoDialog(
                        "Pato (Anas platyrhynchos domesticus)",
                        "Aves acuáticas con patas palmeadas que les permiten nadar con eficacia y un plumaje aceitoso que repele el agua."
                    )
                }

                animalImage3.setImageResource(R.drawable.ic_swan)
                animalName3.text = "Cisne"
                animalImage3.setOnClickListener {
                    showInfoDialog(
                        "Cisne (Cygnus olor)",
                        "Son aves acuáticas grandes y majestuosas, con cuerpos robustos, cuellos largos y elegantes. Son excelentes nadadores y voladores."
                    )
                }

                animalImage4.setImageResource(R.drawable.ic_frog)
                animalName4.text = "Rana"
                animalImage4.setOnClickListener {
                    showInfoDialog(
                        "Rana (Pelophylax perezi)",
                        "Anfibios sin cola, conocidos por su capacidad de salto gracias a sus potentes patas traseras. Tienen la piel suave y, a diferencia de los sapos, no tienen verrugas."
                    )
                }

                animalImage5.visibility = View.GONE
                animalName5.visibility = View.GONE

            }

            "Costas" -> {
                animalImage1.setImageResource(R.drawable.ic_crab)
                animalName1.text = "Cangrejo"
                animalImage1.setOnClickListener {
                    showInfoDialog(
                        "Cangrejo (Brachyura)",
                        "Crustáceo decápodo con un exoesqueleto grueso y un par de pinzas. Fundamental en los ecosistemas costeros."
                    )
                }

                animalImage2.setImageResource(R.drawable.ic_seagull)
                animalName2.text = "Gaviota"
                animalImage2.setOnClickListener {
                    showInfoDialog(
                        "Gaviota (Laridae)",
                        "Aves marinas de plumaje blanco y gris, con picos fuertes y patas palmeadas. Muchas especies son cleptoparásitas y roban comida a otras aves."
                    )
                }

                animalImage3.setImageResource(R.drawable.ic_pelican)
                animalName3.text = "Pelicano"
                animalImage3.setOnClickListener {
                    showInfoDialog(
                        "Pelicano (Pelecanus)",
                        "Aves acuáticas con un gran pico y una bolsa gular extensible para capturar peces. Tienen patas cortas y palmeadas."
                    )
                }

                animalImage4.setImageResource(R.drawable.ic_beaver)
                animalName4.text = "Castor"
                animalImage4.setOnClickListener {
                    showInfoDialog(
                        "Castor (canadensis)",
                        "Roedores semiacuáticos conocidos por construir diques y madrigueras con ramas y troncos. Tienen una cola plana y ancha."
                    )
                }

                animalImage5.setImageResource(R.drawable.ic_heron)
                animalName5.text = "Garza"
                animalImage5.setOnClickListener {
                    showInfoDialog(
                        "Garza (Ardea alba)",
                        "Aves zancudas con cuellos y patas largos. Son depredadoras que cazan peces, anfibios e insectos en aguas poco profundas."
                    )
                }
            }

            "Humedales" ->{
                animalImage1.setImageResource(R.drawable.ic_caiman)
                animalName1.text = "Caiman"
                animalImage1.setOnClickListener {
                    showInfoDialog(
                        "Caiman (Alligatoridae)",
                        "Reptiles semiacuáticos de hocico más ancho y redondeado que el de los cocodrilos, con el cuarto diente mandibular no visible con la boca cerrada."
                    )
                }

                animalImage2.setImageResource(R.drawable.ic_capybara)
                animalName2.text = "Capibara"
                animalImage2.setOnClickListener {
                    showInfoDialog(
                        "Capibara (Hydrochoerus hydrochaeris)",
                        "Es el roedor más grande del mundo, con una piel que se seca rápidamente y patas con membranas interdigitales que lo convierten en un excelente nadador."
                    )
                }

                animalImage3.setImageResource(R.drawable.ic_flamenco)
                animalName3.text = "Flamenco"
                animalImage3.setOnClickListener {
                    showInfoDialog(
                        "Flamenco (Phoenicopterus roseus)",
                        "Aves zancudas de gran tamaño con un plumaje rosa o rojizo, un pico curvo adaptado para filtrar alimento y patas largas. El color de su plumaje proviene de los pigmentos de las algas y crustáceos que comen."
                    )
                }

                animalImage4.setImageResource(R.drawable.ic_dragonfly)
                animalName4.text = "Libelula"
                animalImage4.setOnClickListener {
                    showInfoDialog(
                        "Libelula (Orden Odonata)",
                        "Insectos alados con grandes ojos compuestos y alas transparentes. Son depredadoras y se alimentan de otros insectos."
                    )
                }

                animalImage5.visibility = View.GONE
                animalName5.visibility = View.GONE
            }

            else -> {
                animalName1.text = "No hay animales definidos para este hábitat."
                animalImage1.visibility = View.GONE // Oculta la imagen si no hay nada que mostrar
            }
        }
    }

    // Función para mostrar el punto de interés
    private fun showInfoDialog(title: String, message: String) {
        AlertDialog.Builder(this)
            .setTitle(title)
            .setMessage(message)
            .setPositiveButton("Entendido", null)
            .show()
    }
}