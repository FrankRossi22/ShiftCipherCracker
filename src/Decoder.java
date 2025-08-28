
public class Decoder {
    public static void main(String[] args) {

        String cypherText = "BIVHA JVTTH UKLYZ DLYLA YHPUL KAVSP UNLYV UAOLJ VUCVF ZWYVQ\n" +
                "LJALK SPULV MHKCH UJLHA AOLSP TPAVM CPZPI PSPAF BUAPS AOLMH\n" +
                "SSVMK HYRAO LUAVZ BYMHJ LPMWV ZZPIS LDPAO PUAOL JVUCV FJVSB\n" +
                "TUZMP YLZHS CVLZM YVTIV DHUKZ ALYUA BILZZ PTBSA HULVB ZSFHU\n" +
                "KAVZB ITLYN LHUKT HRLAO LPYLZ JHWLH ZAOLL ZJVYA ZHWWL HYLKA\n" +
                "OLKPM MPJBS AFMVY AOLBI VHAZD HZAVS VJHAL HJVUC VFPUA OLMPY\n" +
                "ZAWSH JLAOL SPTPA VMCPZ PIPSP AFHAI LZAMY VTHJV UUPUN AVDLY\n" +
                "DHZAL UTPSL ZHWHA YVSSP ULVMA LUBIV HAZJV BSKAO LYLMV YLJVC\n" +
                "LYADV OBUKY LKADL UAFTP SLZVM ZLHHJ VUCVF VMMPM AFZOP WZTLH\n" +
                "UDOPS LVJJB WPLKH MYVUA VMVUS FADLU AFMVB YOBUK YLKFH YKZPU\n" +
                "AOLLU VYTVB ZZWHJ LZVMA OLHAS HUAPJ HASLH ZAUPU LTPSS PVUZX\n" +
                "BHYLT PSLZV MVWLY HAPVU HSDHA LYZAO LVULJ VBSKI LTPZZ LKIFA\n" +
                "OLVAO LYDPA OAOLN YLHAL ZALHZ LHUKB ZBHSS FDHZI HKDLH AOLYW\n" +
                "SHFLK HWHYA OPKPU NAOLJ VUCVF ZMYVT NLYTH ULFLZ VYMVY JPUNB\n" +
                "IVHAZ AVZLL RZOLS ALYMY VTAOL LSLTL UAZHA WLYPZ JVWLK LWAOZ\n" +
                "VKPKY VBAPU LHSAL YHAPV UZVMJ VBYZL HUKLT LYNLU JFABY UZPMJ\n" +
                "VUAHJ ADLYL THKLK LSPIL YHALY LYVBA PUNVM JVUCV FZOVD LCLYH\n" +
                "DHFMY VTWHA YVSSP ULZHU KDVSM WHJRZ SVJHA LKIFI SLAJO SLFDH\n" +
                "ZAOLT VZAWY VKBJA PCLTL AOVKK HCPKR HOUAO LNYLH AOPZA VYPHU\n" +
                "VMJYF WAVNY HWOFN PCLZH KYHTH APJHJ JVBUA VMVUL ZBJOY LYVBA\n" +
                "PUNJV UALZA PUOPZ IVVRV UAOLB IVHAD HYZLP GPUNA OLLUP NTHAO\n" +
                "PZWHZ ZHNLL EJLYW ALKMY VTQVO URLLN HUPUA LSSPN LUJLP UDHYY";

        //Set the number of times to shift each letter (excluding ' ' and '\n')
        int shift = 19;
        String decodedText = "";

        //for loop to go through each character in the cypherText, shift it, and then add it to the decodedText
        for (int i = 0; i < cypherText.length(); i++) {
            if(cypherText.charAt(i) == ' ' || cypherText.charAt(i) == '\n') {
                decodedText += cypherText.charAt(i);
                continue;
            }
            // Get the character value (0-25) by subtracting 'A', apply the shift, and convert back to a character
            int charVal = cypherText.charAt(i) - 'A';
            charVal = (charVal + shift) % 26; // Shift forward by j positions
            char decodedChar = (char) (charVal + 'A');
            decodedText += decodedChar;

        }

        System.out.println("Decoded text with " + shift + " shifts: " + decodedText);

    }
}