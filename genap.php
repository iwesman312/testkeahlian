<?php
function pemisah($thestring)
{
    $a = strlen($thestring);
    $result = '';
    for ($i = 0; $i <= $a; $i++) {
        $char = substr($thestring, $i, 1);
        if ($i % 2 == 0 && $i != $a) {
            $result = $result . $char . "-";
        } else {
            $result = $result . $char;
        }
    }
}
echo pemisah(43356);
?>