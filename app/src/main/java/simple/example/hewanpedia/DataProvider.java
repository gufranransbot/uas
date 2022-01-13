package simple.example.hewanpedia;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;
import java.util.jar.JarEntry;

import simple.example.hewanpedia.model.Jerapah;
import simple.example.hewanpedia.model.Kelinci;
import simple.example.hewanpedia.model.Hewan;
import simple.example.hewanpedia.model.Kupukupu;

public class DataProvider {
    private static List<Hewan> hewans = new ArrayList<>();

    private static List<Kupukupu> initDatakupukupu(Context ctx) { {
            List<Kupukupu> kupukupus = new ArrayList<>();
            kupukupus.add(new Kupukupu(ctx.getString(R.string.antheraea_mylitta_nama),ctx.getString(R.string.antheraea_mylitta_asal),
                    ctx.getString(R.string.antheraea_mylitta_deskripsi), R.drawable.kupukupu_antheraea_mylitta));
            kupukupus.add(new Kupukupu(ctx.getString(R.string.kupukupu_silvery_blue_nama),ctx.getString(R.string.kupukupu_silvery_blue_asal),
                    ctx.getString(R.string.kupukupu_silvery_blue_deskripsi), R.drawable.kupukupu_silvery_blue));
            kupukupus.add(new Kupukupu(ctx.getString(R.string.kupukupu_sayap_peri_nama),ctx.getString(R.string.kupukupu_sayap_peri_asal),
                    ctx.getString(R.string.kupukupu_sayap_peri_deskripsi), R.drawable.kupukupu_sapho_longwing));
            kupukupus.add(new Kupukupu(ctx.getString(R.string.banded_orange_nama),ctx.getString(R.string.banded_orange_asal),
                    ctx.getString(R.string.banded_orange_deskripsi), R.drawable.kupukupu_silvery_blue));
            return kupukupus;
    }
    }
    private static List<Jerapah> initDataJerapahs(Context ctx) {
        List<Jerapah> Jerapahs = new ArrayList<>();
        Jerapahs.add(new Jerapah(ctx.getString(R.string.giraffa_camelopardalis_nama),ctx.getString(R.string.giraffa_camelopardalis_asal),
                ctx.getString(R.string.giraffa_camelopardalis_deskripsi), R.drawable.jerapah_giraffa_camelopardalis));
        Jerapahs.add(new Jerapah(ctx.getString(R.string.reticulated_giraffe_nama),ctx.getString(R.string.reticulated_giraffe_asal),
                ctx.getString(R.string.reticulated_giraffe_deskripsi), R.drawable.jerapah_reticulated_giraffe));
        Jerapahs.add(new Jerapah(ctx.getString(R.string.southern_giraffe_nama),ctx.getString(R.string.southern_giraffe_asal),
                ctx.getString(R.string.southern_giraffe_deskripsi), R.drawable.jerapah_southern_giraffe));
        Jerapahs.add(new Jerapah(ctx.getString(R.string.masai_giraffe_nama),ctx.getString(R.string.masai_giraffe_asal),
                ctx.getString(R.string.masai_giraffe_diskripsi), R.drawable.jerapah_masai_giraffe));
        return Jerapahs;
    }
    private static List<Kelinci> initDataKelinci(Context ctx) {
        List<Kelinci> kelincis = new ArrayList<>();
        kelincis.add(new Kelinci(ctx.getString(R.string.netherland_dwarf_nama),ctx.getString(R.string.netherland_dwarf_asal),
                ctx.getString(R.string.netherland_dwarf_diskripsi), R.drawable.kelinci_netherland_dwarf));
        kelincis.add(new Kelinci(ctx.getString(R.string.orictolagus_cuniculus_nama),ctx.getString(R.string.orictolagus_cuniculus_asal),
                ctx.getString(R.string.orictolagus_cuniculus_diskripsi), R.drawable.kelinci_orictolagus_cuniculus));
        kelincis.add(new Kelinci(ctx.getString(R.string.holland_lop_nama),ctx.getString(R.string.holland_lop_asal),
                ctx.getString(R.string.holland_lop_diskripsi), R.drawable.kelinci_holland_lop));
        kelincis.add(new Kelinci(ctx.getString(R.string.mini_lop_nama),ctx.getString(R.string.mini_lop_asal),
                ctx.getString(R.string.mini_lop_diskripsi), R.drawable.kelinci_mini_lop));
        kelincis.add(new Kelinci(ctx.getString(R.string.raksasa_nama),ctx.getString(R.string.raksasa_asal),
                ctx.getString(R.string.raksasa_diskripsi), R.drawable.kelinci_raksasa));
        kelincis.add(new Kelinci(ctx.getString(R.string.rex_nama),ctx.getString(R.string.rex_asal),
                ctx.getString(R.string.rex_diskripsi), R.drawable.kelinci_rex));
        return kelincis;
    }

    private static void initAllHewans(Context ctx) {
        hewans.addAll(initDatakupukupu(ctx));
        hewans.addAll(initDataJerapahs(ctx));
        hewans.addAll(initDataKelinci(ctx));
    }

    public static List<Hewan> getAllHewan(Context ctx) {
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        return  hewans;
    }

    public static List<Hewan> getHewansByTipe(Context ctx, String jenis) {
        List<Hewan> hewansByType = new ArrayList<>();
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        for (Hewan h : hewans) {
            if (h.getJenis().equals(jenis)) {
                hewansByType.add(h);
            }
        }
        return hewansByType;
    }

}
